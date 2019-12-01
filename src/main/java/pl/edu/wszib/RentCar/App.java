package pl.edu.wszib.RentCar;

import pl.edu.wszib.RentCar.db.DBConnector;
//mport pl.edu.wszib.RentCar.gui.GUI;
import pl.edu.wszib.RentCar.gui.GUI;
import pl.edu.wszib.RentCar.models.Car;

import static pl.edu.wszib.RentCar.gui.GUI.showMenu;

public class App {
    public App(){

    }

    public static void main(String[] args) {

        DBConnector.connect();
        showMenu();
        //DBConnector.showCarInfo();
        //DBConnector.rentCar(1);
        //Car car = new Car("Opel", "Kadet", 33);
        //DBConnector.addCar(car);

    }
}
