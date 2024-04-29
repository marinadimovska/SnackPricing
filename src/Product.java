class Product {
    private int productId;
    private String productName;
    private double unitCost;
    private double markup;
    private String promotion;

    public Product() {
    }

    public Product(int productId, String productName, double unitCost, double markup, String promotion) {
        this.productId = productId;
        this.productName = productName;
        this.unitCost = unitCost;
        this.markup = markup;
        this.promotion = promotion;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public double getMarkup() {
        return markup;
    }

    public void setMarkup(double markup) {
        this.markup = markup;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
}