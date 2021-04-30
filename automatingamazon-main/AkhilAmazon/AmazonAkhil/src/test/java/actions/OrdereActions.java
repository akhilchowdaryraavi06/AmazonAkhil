package actions;

class OrderActions {

    public void navigateToHomePage(){
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
    }

    public void loginAs(String username, String password){
        HomePage homePage = new HomePage();
        SignInPage signIn = new SignInPage();
        homePage.navigateToSignInPage();
        signIn.enterUsername(username);
        signIn.enterPassword(password);
        signIn.clickSignInButton();
    }

    public iphone loadProductPageDataIntoProductObject(Products product){
        System.out.println("Starting process to load info for " + product + ":");
        iphone iphone = new iphone();
        ProductPage productPage = new ProductPage();
        productPage.navigateToProductPage(product);
        productPage.verifyProductTitle(product.getProductTitle());
        iphone.loadInfoFromProductPage();
        System.out.println(iphone + "\n");
        return iphone;
    }

    public void addProductToShoppingCartReview(Products product){
        ShoppingCartReviewPage shoppingCartReviewPage = new ShoppingCartReviewPage();
        System.out.println("Adding " + product + " to cart:");
        ProductPage productPage = new ProductPage();
        productPage.navigateToProductPage(product);
        productPage.verifyProductTitle(product.getProductTitle());
        productPage.clickAddToCart();
        shoppingCartReviewPage.verifyOnShoppingCartReviewPage();
    }

    public iphone loadShoppingCartDataIntoProductObject(Products product){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        iphone iphone = new iphone();
        shoppingCartPage.verifyOnShoppingCartPage();

        return iphone;
    }

    public void initializeLogin(){
        System.out.println("INITIALIZING: Signing out, if needed.\n");
        signOut();
    }

    public void initializeCart(){
        System.out.println("INITIALIZING: Deleting all Items in Cart.\n");
        deleteAllItemsIfAnyFromCart();
    }

    public void signOut(){
        HomePage homePage = new HomePage();
        homePage.signOutWithSignOutLink();
    }

    public void deleteAllItemsIfAnyFromCart(){
        HomePage homePage = new HomePage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        String itemsInCart = homePage.getNumberOfItemsListedInShoppingCartIcon();
        if (!itemsInCart.equals("0")){
            homePage.selectShoppingCartIcon();
            shoppingCartPage.deleteAllItemsInCart();
        } else {
            System.out.println("\t* There are already '0' items in the Shopping Cart.");
        }
    }

    private String outputPassOrFailOnFieldComparison(String fieldName, String actualValue, String expectedValue){
        if (actualValue.equals(expectedValue)){
            return "\t* " + fieldName + ": '" + actualValue + "' (PASS)";
        } else {
            return "\t* " + fieldName + ": '" + actualValue + "' : Should be: '" + expectedValue + "' (FAIL)";
        }
    }

    public boolean checkMatchingValues(String testHeading, Object actualValue, Object expectedValue) {
        String successMessage = "\t* The Expected and Actual Values match. (PASS)\n";
        String failureMessage = "\t* The Expected and Actual Values do not match! (FAIL)\n";

        boolean doesPriceMatch = false;

        System.out.println(testHeading);
        System.out.println("\t* Expected Value: " + expectedValue);
        System.out.println("\t* Actual Value: " + actualValue);

        if (actualValue.equals(expectedValue)) {
            System.out.println(successMessage);
            doesPriceMatch = true;
        } else {
            System.out.println(failureMessage);
            doesPriceMatch = false;
        }
        return doesPriceMatch;
    }

    private class HomePage {
        public void navigateToHomePage() {
        }

        public void navigateToSignInPage() {
        }

        public void signOutWithSignOutLink() {
        }

        public String getNumberOfItemsListedInShoppingCartIcon() {
            return null;
        }

        public void selectShoppingCartIcon() {
        }
    }

    private class SignInPage {
        public void enterUsername(String username) {
        }

        public void enterPassword(String password) {
        }

        public void clickSignInButton() {
        }
    }

    private class iphone {
        public void loadInfoFromProductPage() {
        }
    }

    private class Products {
        public Object getProductTitle() {
            return getProductTitle();
        }

    }

    private class ProductPage {
        public void navigateToProductPage(Products product) {
        }

        public void verifyProductTitle(Object productTitle) {
        }

        public void clickAddToCart() {
        }
    }

    private class ShoppingCartReviewPage {
        public void verifyOnShoppingCartReviewPage() {
        }
    }

    private class ShoppingCartPage {
        public void verifyOnShoppingCartPage() {
        }

        public void deleteAllItemsInCart() {
        }
    }
}

