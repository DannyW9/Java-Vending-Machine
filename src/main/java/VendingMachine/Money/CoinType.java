package VendingMachine.Money;

public enum CoinType {

    ONE(1, false),
    TWO(2, false),
    FIVE(5, true),
    TEN(10, true),
    TWENTY(20, true),
    FIFTY(50, true),
    ONEHUNDRED(100, true),
    TWOHUNDRED(200, true);

    private final int value;
    private final boolean validity;

    CoinType(int value, boolean validity) {
        this.value = value;
        this.validity = validity;
    }

    public int getValue() {
        return value;
    }

    public boolean isValid() {
        return validity;
    }
}
