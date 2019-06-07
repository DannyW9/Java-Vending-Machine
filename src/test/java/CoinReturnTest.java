import VendingMachine.Machine.CoinReturn;
import VendingMachine.Money.Coin;
import VendingMachine.Money.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    private CoinReturn coinReturn;
    private Coin coin1;
    private Coin coin2;
    private Coin coin3;

    @Before
    public void setUp() {
        coinReturn = new CoinReturn();
        coin1 = new Coin(CoinType.FIFTY);
        coin2 = new Coin(CoinType.ONEHUNDRED);
        coin3 = new Coin(CoinType.TWENTY);
        coinReturn.addCoin(coin1);
        coinReturn.addCoin(coin2);
        coinReturn.addCoin(coin3);
    }

    @Test
    public void canAddCoinsAndReturnCoinArrayList() {
        assertEquals(3, coinReturn.getCoins());
    }

    @Test
    public void canGetTotalAmountOfCoinsToReturn() {
        assertEquals(170, coinReturn.totalAmount());
    }

    @Test
    public void canResetTotalAmountOfCoins() {
        coinReturn.resetTotal();
        assertEquals(0, coinReturn.getCoins());
    }

    @Test
    public void canReturnCoins() {
        assertEquals("170 pence has been returned from the machine.", coinReturn.returnCoins());
        assertEquals(0, coinReturn.getCoins());
    }
}
