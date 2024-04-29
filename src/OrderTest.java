import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testCalculateTotalBeforeDiscounts() {
        Product product1 = new Product(1, "Danish Muffin", 0.52, 80, "none");
        Product product2 = new Product(2, "Granny’s Cup Cake", 0.38, 120, "30% off");
        Map<Product, Integer> productsOrdered = new HashMap<>();
        productsOrdered.put(product1, 100);
        productsOrdered.put(product2, 200);
        Client client = new Client(1, "ABC Distribution", 5, 0, 2);
        Order order = new Order(client, productsOrdered);
        double expectedTotal = 100 * order.calculateUnitPrice(product1) + 200 * order.calculateUnitPrice(product2);
        assertEquals(expectedTotal, order.calculateTotalBeforeDiscounts());
    }
}

