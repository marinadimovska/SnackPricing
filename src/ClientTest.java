import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    public void testGetClientId() {
        Client client = new Client(1, "ABC Distribution", 5, 0, 2);
        assertEquals(1, client.getClientId());
    }

    @Test
    public void testGetClientName() {
        Client client = new Client(1, "ABC Distribution", 5, 0, 2);
        assertEquals("ABC Distribution", client.getClientName());
    }

    @Test
    public void testGetBasicClientDiscount() {
        Client client = new Client(1, "ABC Distribution", 5, 0, 2);
        assertEquals(5, client.getBasicClientDiscount());
    }

    @Test
    public void testGetVolumeDiscountAbove10000() {
        Client client = new Client(1, "ABC Distribution", 5, 0, 2);
        assertEquals(0, client.getVolumeDiscountAbove10000());
    }

    @Test
    public void testGetVolumeDiscountAbove30000() {
        Client client = new Client(1, "ABC Distribution", 5, 0, 2);
        assertEquals(2, client.getVolumeDiscountAbove30000());
    }

    @Test
    public void testSetClientId() {
        Client client = new Client();
        client.setClientId(2);
        assertEquals(2, client.getClientId());
    }

    @Test
    public void testSetClientName() {
        Client client = new Client();
        client.setClientName("DEF Foods");
        assertEquals("DEF Foods", client.getClientName());
    }

    @Test
    public void testSetBasicClientDiscount() {
        Client client = new Client();
        client.setBasicClientDiscount(4);
        assertEquals(4, client.getBasicClientDiscount());
    }

    @Test
    public void testSetVolumeDiscountAbove10000() {
        Client client = new Client();
        client.setVolumeDiscountAbove10000(1);
        assertEquals(1, client.getVolumeDiscountAbove10000());
    }

    @Test
    public void testSetVolumeDiscountAbove30000() {
        Client client = new Client();
        client.setVolumeDiscountAbove30000(3);
        assertEquals(3, client.getVolumeDiscountAbove30000());
    }
}
