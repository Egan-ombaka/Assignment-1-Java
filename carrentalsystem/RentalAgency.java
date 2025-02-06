package carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Car findCar(String make, String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(make)) {
                return car;
            }
        }
        return null;
    }

    public void returnCar(Car car) {
        car.returnCar();
        System.out.println("Car Returned. ");
    }

    public void rentCar(String string, String string2, Customer customer1) {
        throw new UnsupportedOperationException("Unimplemented method 'rentCar'");
    }
}
