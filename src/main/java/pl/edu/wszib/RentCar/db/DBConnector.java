package pl.edu.wszib.RentCar.db;

import org.apache.commons.codec.digest.DigestUtils;
import pl.edu.wszib.RentCar.models.Car;

import java.sql.*;

public class DBConnector {
    public static Connection connection = null;

    public static void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/carrepository?user=root&password=");
        } catch (SQLException var1) {
            var1.printStackTrace();
        } catch (ClassNotFoundException var2) {
            var2.printStackTrace();
        }
    }

    public static void addCar(Car car) {
        String sql = "INSERT INTO carrepo (carId, brand, model, rented) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, car.getCarId());
            preparedStatement.setString(2, car.getBrand());
            preparedStatement.setString(3, car.getModel());
            preparedStatement.setBoolean(4, car.isRented());
            preparedStatement.executeUpdate();
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

    }

    public static void showCarInfo() {
        try {
            String sql = "SELECT * from carrepo"; //tworzy zapytanie sql

            Statement smt = connection.createStatement();
            ResultSet rs = smt.executeQuery(sql); //wykonuje zapytanie i zapisuje wynik do resultsetu

            if (rs.next()) {
                do {
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                } while (rs.next());
            } else {
                System.out.println("No cars to rent. Buy some!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
