//this doesn't work for some reason and I'm not sure why not
public class Car {

    private String carMake;
    private String carModel;
    public String carOdometer;


    public Car(String make, String model, String odometer) {
        carMake = make;
        carModel = model;
        carOdometer = odometer;
    }

    public static void main(String[] args) {
        Car c1 = new Car("test", "teest", "12123");
    }
}
