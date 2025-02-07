// Car Firm Management

import java.util.ArrayList;

public class CarFirm {
    
    private ArrayList<Car> cars;
    private ArrayList<Customer> customers;
    private ArrayList<RentalTransaction> transactions;

    // Car firm constructor
    public CarFirm() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(String customerId, String regNo) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getCar().getRegNo().equals(regNo)) {
                transaction.returnRental();
                return;
            }
        }
        System.out.println("Sorry, this car is not available for rental!");
    } 

    public void availableCars() {
        System.out.println("Available Cars: ");
        for (Car car : cars) {
            if (car.isAvailable()) {
                car.carInfo();
            }
        }
    }

    public void displayCustomers() {
        System.out.println("Customers: ");
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getCustomerId() + ", Name: " + customer.getName());
        }
    }
}