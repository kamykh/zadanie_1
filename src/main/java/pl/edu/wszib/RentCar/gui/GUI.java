package pl.edu.wszib.RentCar.gui;

import pl.edu.wszib.RentCar.db.DBConnector;
import pl.edu.wszib.RentCar.models.Car;

import java.util.Scanner;

import static pl.edu.wszib.RentCar.db.DBConnector.*;
import static pl.edu.wszib.RentCar.db.DBConnector.showCarInfo;

public class GUI {
    public GUI(){

    }
    public static void showMenu(){
        //metoda statyczna (nie potrzeba tworzyc obiektu, mozna sie zawsze odwolac)
        System.out.println("Type number of desired action: ");
        System.out.println("1. Car aviable to rent");
        System.out.println("2. Rent a car");
        System.out.println("3. Quit Menu");

        Scanner scanner = new Scanner(System.in);
        String linia = scanner.nextLine();

        byte var3 = -1;

        switch(linia.hashCode()) {
            case 49:
                if (linia.equals("1")) {
                    var3 = 0;
                }
                break;
            case 50:
                if (linia.equals("2")) {
                    var3 = 1;
                }
                break;
            case 51:
                if (linia.equals("3")) {
                    var3 = 2;
                }
                break;
        }

        switch(var3){
            case 0:
                showCarInfo();
                showMenu();
                break;
            case 1:

                showRentMenu();
                showMenu();
                break;

            case 2:

                System.exit(0);
                break;

            default:
                showMenu();
        }
    }

    public static void showRentMenu(){
        System.out.println("Type ID of car you would like to rent");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        rentCar(id);
    }


}
