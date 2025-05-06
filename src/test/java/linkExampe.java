import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class linkExampe {
    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml");
    }




    @Test
    public void LinkTest(){
        //take me to dashboard
       WebElement homeLink= driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();



        //find my destination
       WebElement whereToGo = driver.findElement(new By.ByPartialLinkText("Find the URL."));
      String path = whereToGo.getAttribute("href");
      System.out.println("this link is going to:"+path);


      //am i broken link
      WebElement brokenList =   driver.findElement(new By.ByLinkText("Broken?"));
      brokenList.click();

     String title = driver.getTitle();
     if(title.contains("404")){
         System.out.println("this is broken");
     }
     else {
         System.out.println("this is NOT broken");
     }
        driver.navigate().back();

     //DUPLICATE LINK
        WebElement homeLink1= driver.findElement(By.linkText("Go to Dashboard"));
        homeLink1.click();

        driver.navigate().back();


        //count page link
        List<WebElement> countfullpagelink =  driver.findElements(new By.ByTagName("a"));
        int pageLinkCount = countfullpagelink.size();
        System.out.println("this is "+pageLinkCount);

        //CountLayOutLink
      WebElement layoutEliment = driver.findElement(By.className("layout-main-content"));
      List<WebElement>count0fLayoutLinks=layoutEliment.findElements(By.tagName("a"));
      System.out.println("this is "+count0fLayoutLinks.size());



    }
}