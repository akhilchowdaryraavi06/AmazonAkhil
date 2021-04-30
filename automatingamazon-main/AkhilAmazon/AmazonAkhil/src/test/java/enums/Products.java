package enums;

public enum Products {
    iphone12("1619673179","iphone12");

    // The price will always fluctuate. The product id and product title will be more or less constant.
    private String id;
    private String productTitle;

    Products(String id, String productTitle){
        this.id = id;
        this.productTitle = productTitle;
    }

    public String getProductId(){
        return id;
    }

    public String getProductTitle(){
        return productTitle;
    }
}

