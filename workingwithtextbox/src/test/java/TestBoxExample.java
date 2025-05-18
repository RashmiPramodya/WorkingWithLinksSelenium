import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestBoxExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        // Optional: Set the path to chromedriver if needed
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");

    }

    @Test
    public void textboxtest() {
        // 01 - Enter name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Rashmi");
        System.out.println("Name entered successfully.");

        // 02 - Append Country
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("Chennai");
        System.out.println("Country appended successfully.");

        // 03 - Check whether the field is disabled
        WebElement disabledField = driver.findElement(By.id("j_idt88:j_idt93"));
        boolean isEnabled = disabledField.isEnabled();
        System.out.println("Is the field enabled? " + isEnabled);

        // 04 - Clear the typed text
        WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
        clearText.clear();
        System.out.println("Text cleared.");

        // 05 - Get the typed text
        WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97"));
        String value = textElement.getAttribute("value");
        System.out.println("Retrieved value: " + value);


        //06.rewrite the type text
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("senanayakarashmi2000@gmail.com" + Keys.TAB + "conform go to next element");
    }





//    @AfterMethod
//    public void closeBrowser() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
