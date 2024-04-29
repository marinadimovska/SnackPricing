class Client {
    private int clientId;
    private String clientName;
    private double basicClientDiscount;
    private double volumeDiscountAbove10000;
    private double volumeDiscountAbove30000;

    public Client() {
    }

    public Client(int clientId, String clientName, double basicClientDiscount, double volumeDiscountAbove10000, double volumeDiscountAbove30000) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.basicClientDiscount = basicClientDiscount;
        this.volumeDiscountAbove10000 = volumeDiscountAbove10000;
        this.volumeDiscountAbove30000 = volumeDiscountAbove30000;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBasicClientDiscount() {
        return basicClientDiscount;
    }

    public void setBasicClientDiscount(double basicClientDiscount) {
        this.basicClientDiscount = basicClientDiscount;
    }

    public double getVolumeDiscountAbove10000() {
        return volumeDiscountAbove10000;
    }

    public void setVolumeDiscountAbove10000(double volumeDiscountAbove10000) {
        this.volumeDiscountAbove10000 = volumeDiscountAbove10000;
    }

    public double getVolumeDiscountAbove30000() {
        return volumeDiscountAbove30000;
    }

    public void setVolumeDiscountAbove30000(double volumeDiscountAbove30000) {
        this.volumeDiscountAbove30000 = volumeDiscountAbove30000;
    }
}
