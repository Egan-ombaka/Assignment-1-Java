package carrentalsystem;

public class Customer {
    private String customerId;
    private String name;
    private String contactInfo;

    public Customer (String customerId, String name, String contactInfo) {
        this.customerId = customerId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getCustomerId () {
        return customerId;
    }

    public String getName () {
        return name;
    }

    public String getContactInfo () {
        return contactInfo;
    }
}
