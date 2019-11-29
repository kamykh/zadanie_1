package pl.edu.wszib.RentCar.models;

public class Car {

    private String brand;
    private String model;
    private int carId;
    private boolean rented;

    public Car(String brand, String model, String carId,){
        this.brand = brand;
        this.model = model;
        this.carId = carId;
        this.rented = false;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getCarId() {
        return carId;
    }
    public boolean isRented() {
        return rented;
    }
    public void setRented(boolean rented) {
        this.rented = rented;
    }

}
