import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RemoveProduct {
    private By.ByClassName driver;
    private SearchContext locator;
    List<WebElement> removeProductList = driver.findElements(locator);
    WebElement removeProduct;RemoveProduct() {
        driver.findElement(locator).click();
        }
        }
