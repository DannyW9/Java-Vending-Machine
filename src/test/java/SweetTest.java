import VendingMachine.Products.Sweet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    private Sweet sweet;

    @Before
    public void setUp() {
        sweet = new Sweet("Mars Bar");
    }

    @Test
    public void canGetType() {
        assertEquals("Sweet", sweet.getType());
    }

    @Test
    public void canGetName() {
        assertEquals("Mars Bar", sweet.getName());
    }
}
