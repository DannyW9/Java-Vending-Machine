import VendingMachine.Machine.Credit;
import VendingMachine.Money.Coin;
import VendingMachine.Money.CoinType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CreditTest {

    private Credit credit;
    private Coin coin1;
    private Coin coin2;
    private Coin coin3;


    @Before
    public void setUp() {
        credit = new Credit();
        coin1 = new Coin(CoinType.FIFTY);
        coin2 = new Coin(CoinType.TWOHUNDRED);
        coin3 = new Coin(CoinType.ONE);
        credit.addCoin(coin1);
        credit.addCoin(coin2);
    }

    @Test
    public void canAddCoinsAndReturnCoinArrayList() {
        assertEquals(2, credit.getCoins());
    }

    @Test
    public void canGetTotalAmountOfCoinsCurrentlyInserted() {
        assertEquals(250, credit.totalAmount());
    }

}
