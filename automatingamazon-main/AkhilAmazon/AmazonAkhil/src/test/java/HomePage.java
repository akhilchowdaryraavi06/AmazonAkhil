
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.testng.util.Strings;
        import utils.COMMONUtils;

import java.net.URL;

public class HomePage extends COMMONUtils {
    private final By YOUR_ACCOUNT = By.id("nav-link-yourAccount");
    private final By SHOPPING_CART_ICON = By.cssSelector("#nav-cart");
    private final By SHOPPING_CART_COUNT = By.cssSelector("#nav-cart > #nav-cart-count");

    public HomePage(WebDriver driver){
    }

    public void navigateToHomePage() {
        Strings Url = BASEURL.getURL();
        System.out.println("Navigating to Amazon.com: " + getCurrentURL());
        navigateToURL(getCurrentURL());
    }

    public void navigateToSignInPage(){
        System.out.println("HOME_PAGE: Selecting [YOUR_ACCOUNT] in navigation bar.");
        scrollToThenClick(YOUR_ACCOUNT);
        System.out.println("HOME_PAGE: Navigating to the SIGNIN_PAGE.\n");
    }

    public void signOutWithSignOutLink(){
        String url = BASEURl.getURL() + SIGNOUT.getURL();
        navigateToURL(url);
    }

    public void selectShoppingCartIcon(){
        click(SHOPPING_CART_ICON);
    }

    public String getNumberOfItemsListedInShoppingCartIcon(){
        return getElementText(SHOPPING_CART_COUNT);
    }

    private static class BASEURL {
        public static Strings getURL() {
            return null;
        }
    }

    private static class BASEURl {
        public static String getURL() {
            return null;
        }
    }

    private static class SIGNOUT {
        public static String getURL() {
            return null;
        }
    }
}


