package carrentalsystem;

public class Main {
    public static void main (String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car ("Toyota",  2024, 6.0, true);
        Car car2 = new Car ("Porsche", 2025, 4.0, true);
        agency.addCar(car1);
        agency.addCar(car2);

        Customer customer1 = new Customer("C001", "John Doe", "john@example.com");
        agency.addCustomer(customer1);

        agency.rentCar("Corolla", "Toyota", customer1);
        agency.returnCar(car1);
    }
}