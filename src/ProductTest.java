import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testGetProductId() {
        Product product = new Product(1, "Danish Muffin", 0.52, 80, "none");
        assertEquals(1, product.getProductId());
    }

    @Test
    public void testGetProductName() {
        Product product = new Product(1, "Danish Muffin", 0.52, 80, "none");
        assertEquals("Danish Muffin", product.getProductName());
    }

    @Test
    public void testGetUnitCost() {
        Product product = new Product(1, "Danish Muffin", 0.52, 80, "none");
        assertEquals(0.52, product.getUnitCost());
    }

    @Test
    public void testGetMarkup() {
        Product product = new Product(1, "Danish Muffin", 0.52, 80, "none");
        assertEquals(80, product.getMarkup());
    }

    @Test
    public void testGetPromotion() {
        Product product = new Product(1, "Danish Muffin", 0.52, 80, "none");
        assertEquals("none", product.getPromotion());
    }
}
