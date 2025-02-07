/*
 * Main Class runs and debugs the program
 *
 * @AUTHOR : Egan Nyamisoa
 * REG NO : BSE-01-0076/2024
 * Object Oriented Programming 2 
 * Assignment 1
 * 
 * A car Rental Agency Management System.
 */

 public class Main {
    
    public static void main (String[] args) {
        CarFirm firm = new CarFirm();

        // available cars
        firm.addCar(new Car("Volkswagen", "Golf", "VW2025", true));
        firm.addCar(new Car("Toyota", "Corolla", "TOY2021", true));

        // add customers
        firm.addCustomer(new Customer("C001", "Eganh Ombaka"));
        firm.addCustomer(new Customer("C002", "James Doe"));

        System.out.println("Available cars:");
        firm.availableCars();

        System.out.println("\nCustomer details:");
        firm.displayCustomers();
    }
}