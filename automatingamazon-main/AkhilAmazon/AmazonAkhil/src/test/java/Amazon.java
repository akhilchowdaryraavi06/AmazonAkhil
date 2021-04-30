import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Amazon {

    private WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        driver=Browser.openBrowser();
    }

    @Test
    public void verifyValidPincode() throws InterruptedException, IOException {
        Reports.createTest("Verify valid pincode");
        HomePage homePage=new HomePage(driver);

    }


    public void testParameterWithXML() throws InterruptedException{
        driver.get("http://amazon.com");
        WebElement userName = driver.findElement(By.name("uid"));
        userName.sendKeys("1234");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234");
    }


        public void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.in");
            driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("iphone12");
            driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//*[contains(text(),'iphone12')]")).click();
            Set<String> ids = driver.getWindowHandles();
            Iterator<String> it = ids.iterator();
            String parentId = it.next();
            String childId = it.next();
            driver.switchTo().window(childId);
            driver.findElement(By.id("add-to-cart-button")).click();
        }

    }