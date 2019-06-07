import VendingMachine.Money.Coin;
import VendingMachine.Money.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CoinTest {

    private Coin coin1;

    @Before
    public void setUp() {
        coin1 = new Coin(CoinType.FIFTY);
    }

    @Test
    public void canGetCoinType() {
        assertEquals(CoinType.FIFTY, coin1.getCoinType());
    }

    @Test
    public void canGetValue() {
        assertEquals(50, coin1.getCoinValue());
    }

    @Test
    public void canGetValidity() {
        assertTrue(coin1.checkCoinValidity());
    }
}
