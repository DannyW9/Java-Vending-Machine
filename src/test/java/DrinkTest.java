import VendingMachine.Products.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

        private Drink drink;

        @Before
        public void setUp() {
            drink = new Drink("Fanta");
        }

        @Test
        public void canGetType() {
            assertEquals("Drink", drink.getType());
        }

        @Test
        public void canGetName() {
            assertEquals("Fanta", drink.getName());
        }

}
