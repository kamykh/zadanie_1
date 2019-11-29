package pl.edu.wszib.RentCar;

import pl.edu.wszib.RentCar.db.DBConnector;
//mport pl.edu.wszib.RentCar.gui.GUI;
import pl.edu.wszib.RentCar.models.Car;

public class App {
    public App(){

    }

    public static void main(String[] args) {
        DBConnector.connect();
        Car car = new Car("Opel", "Kadet", 33);
        //DBConnector.addCar(car);
        DBConnector.showCarInfo();
    }
}
