public class Person {
    private String name;
    private int age;
    private int mobile;
    private String address;

    public Person(String name, int age, int mobile, String address) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;

    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {

            this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = String.valueOf(address);
    }

    public boolean ageValidator()
    {
        if (age>=18 && age<=25)
            return true;
        else
            return false;
    }
    public boolean mobileValidator()
    {
        String s=Integer.toString(mobile);
        if (s.length()==8)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Address address=new Address("2","Dhaka");
        Person p=new Person("Alif", 28, 123456789, address.toString());
        OTP otp=new OTP(123456);
        System.out.println(p.name+" "+p.age+" "+p.mobile+" "+address.getDistrict()+" "+address.getStreet());
        System.out.println("OTP Validity "+otp.otpValidator());
        System.out.println("Age Validity "+p.ageValidator());
        System.out.println("Address Validity "+address.addressValidator());
        System.out.println("Mobile Validity "+p.mobileValidator());

    }
}
