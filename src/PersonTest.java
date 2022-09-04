import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void ageValidator() {
        Address address=new Address("2","Dhaka");
        Person p=new Person("Alif", 24, 123456789, address.toString());
        assertTrue(p.getAge()>=18 && p.getAge()<=25);
    }

    @Test
    void ageValidator2() {
        Address address=new Address("2","Dhaka");
        Person p=new Person("Alif", 17, 123456789, address.toString());
        assertFalse(p.getAge()>=18 && p.getAge()<=25);
    }

    @Test
    void ageValidator3() {
        Address address=new Address("2","Dhaka");
        Person p=new Person("Alif", 28, 123456789, address.toString());
        assertFalse(p.getAge()>=18 && p.getAge()<=25);
    }

    @Test
    void mobileValidator() {
        Address address=new Address("2","Dhaka");
        Person p=new Person("Alif", 24, 12345678, address.toString());
        String s=Integer.toString(p.getMobile());
        assertTrue(s.length()==8);
    }

    @Test
    void mobileValidator2() {
        Address address=new Address("2","Dhaka");
        Person p=new Person("Alif", 24, 123456789, address.toString());
        String s=Integer.toString(p.getMobile());
        assertFalse(s.length()==8);
    }

    @Test
    void mobileValidator3() {
        Address address=new Address("2","Dhaka");
        Person p=new Person("Alif", 24, 1234567, address.toString());
        String s=Integer.toString(p.getMobile());
        assertFalse(s.length()==8);
    }
}