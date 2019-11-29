package pl.edu.wszib.RentCar.gui;

import java.util.Scanner;

public class GUI {
    public GUI{
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


                break;
            case 1:

                //rentcarmenu
                showMenu();

                break;

            case 2:

                System.exit(0);
                break;

            default:
                showMenu();
        }
    }

    public static void rentMenu(){
        System.out.println("Write car ID.");
        Scanner scanner = new Scanner(System.in);
        Scanner givenCarId = scanner.nextLine();

        try{
            if(car != NULL){
                car.setRent(true);
            }
        } catch(NumberFormatException var3)

    }


}
