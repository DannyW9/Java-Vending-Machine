import VendingMachine.Machine.*;
import VendingMachine.Money.Coin;
import VendingMachine.Money.CoinType;
import VendingMachine.Products.Crisp;
import VendingMachine.Products.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest {

    private VendingMachine vendingMachine;
    private Compartment compartment1;
    private Compartment compartment2;
    private Crisp crisp;
    private Drink drink;
    private Coin coin1;
    private Coin coin2;

    @Before
    public void setUp() {
        vendingMachine = new VendingMachine();
        crisp = new Crisp("Salt & Vinegar Crisps");
        compartment1 = new Compartment(CompartmentCode.A1, crisp);
        drink = new Drink("Monster");
        compartment2 = new Compartment(CompartmentCode.C3, drink);
        vendingMachine.addCompartment(compartment1);
        vendingMachine.addCompartment(compartment2);
        coin1 = new Coin(CoinType.FIFTY);
        coin2 = new Coin(CoinType.ONE);
    }

    @Test
    public void hasCompartments() {
        assertEquals(2, vendingMachine.getCompartments().size());
    }

    @Test
    public void canAddCoinToCredit() {
        vendingMachine.addCoinToCredit(coin1);
        assertEquals(50, vendingMachine.getCredit().totalAmount());
    }

    @Test
    public void canAddCoinToCoinReturn() {
        vendingMachine.addCoinToCoinReturn(coin1);
        assertEquals(50, vendingMachine.getCoinReturn().totalAmount());
        }

    @Test
    public void canCheckCoinValidity__Not_Valid() {
        assertFalse(vendingMachine.checkCoinValidity(coin2));
    }

    @Test
    public void canCheckCoinValidity__Valid() {
        assertTrue(vendingMachine.checkCoinValidity(coin1));
    }

    @Test
    public void canAddValidCoinToVendingMachine() {
        vendingMachine.addCoinToVendingMachine(coin1);
        assertEquals(50, vendingMachine.getCredit().totalAmount());
    }

    @Test
    public void canAddInvalidCoinToVendingMachine() {
        vendingMachine.addCoinToVendingMachine(coin2);
        assertEquals(1, vendingMachine.getCoinReturn().totalAmount());
    }

    @Test
    public void canPurchaseAProduct() {
        vendingMachine.addCoinToVendingMachine(coin1);
        assertEquals("The compartment of the vending machine opens, revealing the Salt & Vinegar Crisps", vendingMachine.buyProduct(CompartmentCode.A1));
        assertEquals(0, vendingMachine.getCredit().totalAmount());
    }
}
