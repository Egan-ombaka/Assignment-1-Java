class RentalTransaction {

    private Customer customer; // Customer object
    private Car car;

    // RentalTransaction constructor
    public RentalTransaction(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }

    // Function to process rental
    public void processRental() {
        if (car.isAvailable()) {
            car.rentCar();
            System.out.println(customer.getName() + " has rented the car: " + car.getMake());
        } else {
            System.out.println("Car is already rented!");
        }
    }

    public void returnRental() {
        car.returnCar();
        System.out.println(customer.getName() + " has returned the car: " + car.getMake());
    }

    // Get the car object
    public Car getCar() {
        return car;
    }
}