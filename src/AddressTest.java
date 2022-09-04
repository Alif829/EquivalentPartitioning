import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void addressValidator() {
        Address address=new Address("2","Dhaka");
        assertTrue(address.getDistrict()=="Dhaka");
    }

    @Test
    void addressValidator2() {
        Address address=new Address("2","Gazipur");
        assertFalse(address.getDistrict()=="Dhaka");
    }
}