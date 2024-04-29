import java.util.Map;

class Order {
    private Client client;
    private Map<Product, Integer> productsOrdered;

    public Order(Client client, Map<Product, Integer> productsOrdered) {
        this.client = client;
        this.productsOrdered = productsOrdered;
    }

    public double calculateTotalBeforeDiscounts() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : productsOrdered.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double unitPrice = calculateUnitPrice(product);
            total += unitPrice * quantity;
        }
        return total;
    }

    double calculateUnitPrice(Product product) {
        double standardUnitPrice = product.getUnitCost() * (1 + product.getMarkup() / 100);
        String promotion = product.getPromotion();
        if (promotion.equals("30% off")) {
            standardUnitPrice *= 0.7;
        } else if (promotion.equals("0.90 EUR/unit")) {
            standardUnitPrice = 0.90;
        } else if (promotion.equals("Buy 2, get 3rd free")) {
            int quantity = productsOrdered.get(product);
            int freeItems = quantity / 3;
            standardUnitPrice *= (quantity - freeItems) / (double) quantity;
        }
        return standardUnitPrice;
    }

    private double calculateAdditionalVolumeDiscount(double totalBeforeDiscounts) {
        double additionalVolumeDiscount = 0.0;
        if (totalBeforeDiscounts > 10000) {
            additionalVolumeDiscount = totalBeforeDiscounts * (client.getVolumeDiscountAbove10000() / 100);
        }
        if (totalBeforeDiscounts > 30000) {
            additionalVolumeDiscount = totalBeforeDiscounts * (client.getVolumeDiscountAbove30000() / 100);
        }
        return additionalVolumeDiscount;
    }

    public double calculateOrderTotal() {
        double totalBeforeDiscounts = calculateTotalBeforeDiscounts();
        double additionalVolumeDiscount = calculateAdditionalVolumeDiscount(totalBeforeDiscounts);
        double orderTotal = totalBeforeDiscounts * (1 - client.getBasicClientDiscount() / 100) - additionalVolumeDiscount;
        return orderTotal;
    }

    public void generateOrderSummary() {
        System.out.println("Client: " + client.getClientName());
        System.out.printf("%-15s %-10s %-15s %-15s %-15s%n", "Product", "Quantity", "Standard Unit", "Promotional Unit", "Line Total");
        for (Map.Entry<Product, Integer> entry : productsOrdered.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double standardUnitPrice = calculateUnitPrice(product);
            double lineTotal = standardUnitPrice * quantity;
            String promotionUnitPrice = product.getPromotion().equals("none") ? "" : String.format("EUR %.5f", standardUnitPrice);
            System.out.printf("%-15s %-10d %-15s %-15s EUR %.2f%n", product.getProductName(), quantity, String.format("EUR %.2f", standardUnitPrice), promotionUnitPrice, lineTotal);
        }
        double totalBeforeDiscounts = calculateTotalBeforeDiscounts();
        double orderTotal = calculateOrderTotal();
        double additionalVolumeDiscount = calculateAdditionalVolumeDiscount(totalBeforeDiscounts);
        System.out.printf("%-39s EUR %.2f%n", "Total Before Client Discounts:", totalBeforeDiscounts);
        System.out.printf("%-39s EUR %.2f%n", "Additional Volume Discount at 7%:", additionalVolumeDiscount);
        System.out.printf("%-39s EUR %.2f%n", "Order Total Amount:", orderTotal);
    }
}