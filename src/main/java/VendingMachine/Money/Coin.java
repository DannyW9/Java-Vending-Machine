package VendingMachine.Money;

public class Coin {

    private CoinType coinType;

    public Coin(CoinType coinType) {
        this.coinType = coinType;
    }

    public CoinType getCoinType() {
        return coinType;
    }

    public int getCoinValue(){
        return getCoinType().getValue();
    }

    public boolean checkCoinValidity(){
        return getCoinType().isValid();
    }
}
