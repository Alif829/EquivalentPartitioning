public class Address {
    private String street;
    private String district;

    public Address(String street, String district) {
        this.street = street;
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    public boolean addressValidator()
    {
        if(district=="Dhaka")
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
