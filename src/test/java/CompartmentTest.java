import VendingMachine.Machine.Compartment;
import VendingMachine.Machine.CompartmentCode;
import VendingMachine.Products.Product;
import VendingMachine.Products.Sweet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompartmentTest {

    private Compartment compartment;
    private Sweet sweet;

    @Before
    public void setUp() {
        sweet = new Sweet("Mars Bar");
        compartment = new Compartment(CompartmentCode.A1, sweet);
    }

    @Test
    public void hasCompartmentCode() {
        assertEquals(CompartmentCode.A1, compartment.getCompartmentCode());
    }

    @Test
    public void hasProduct() {
        assertEquals(sweet, compartment.getProduct());
    }

    @Test
    public void hasPriceAfterSettingBasedOnProduct() {
        assertEquals(65, compartment.getPrice());
    }
}
