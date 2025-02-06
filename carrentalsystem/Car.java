package carrentalsystem;

public class Car {
    private String model;
    private int year;
    private double rentalPrice;
    private boolean availability;

    // Constructor to initialize the car object
    public Car(String model, int year, double rentalPrice, boolean availability) {
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
        this.availability = availability;
    }

    // Getter method for model
    public String getModel() {
        return model;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Getter method for rental price
    public double getRentalPrice() {
        return rentalPrice;
    }

    // Getter method for availability
    public boolean isAvailable() {
        return availability;
    }

    // Method to rent the car
    public void rent() {
        if (availability) {
            availability = false;
        } else {
            System.out.println("Sorry, the car model is not available!");
        }
    }

    // Method to return the car
    public void returnCar() {
        availability = true;
    }
}