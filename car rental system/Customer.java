public class Customer {
    private String customerId;
    private String name;

    // Customer constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Customer functions
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}