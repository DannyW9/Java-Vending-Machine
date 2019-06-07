import VendingMachine.Products.Crisp;
import VendingMachine.Products.Sweet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispTest {

        private Crisp crisp;

        @Before
        public void setUp() {
            crisp = new Crisp("Salt & Vinegar");
        }

        @Test
        public void canGetType() {
            assertEquals("Crisp", crisp.getType());
        }

        @Test
        public void canGetName() {
            assertEquals("Salt & Vinegar", crisp.getName());
        }
}
