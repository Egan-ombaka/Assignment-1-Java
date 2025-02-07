// car details class

 public class Car {
 
    private String carModel;
    private String make;
    private String regNo;
    private boolean isAvailable;

    //The Car class constructor.
    public Car(String carModel, String make, String regNo, boolean isAvailable) {
        this.carModel = carModel;
        this.make = make;
        this.regNo = regNo;
        this.isAvailable = isAvailable;
    }

    //Car information getter methods
    public String getRegNo() {
        return regNo;
    }

    public String getCarModel(){
        return carModel;
    }

    public String getMake() {
        return make;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //determining if the car is rented out or has been returned
    public void rentCar(){
        this.isAvailable = false;
    }
    public void returnCar() {
        this.isAvailable = true;
    }

    // dispaliying the car details
    public void carInfo() {
        System.out.println(regNo + " " + make + " " + carModel + " " + (isAvailable ? "Available" : " Rented") );
    }

 }