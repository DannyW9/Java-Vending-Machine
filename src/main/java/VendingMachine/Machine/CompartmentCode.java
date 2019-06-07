package VendingMachine.Machine;

public enum CompartmentCode {

    A1("Sweet"),
    B2("Crisp"),
    C3("Drink");

    private final String productType;

    CompartmentCode(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }
}
