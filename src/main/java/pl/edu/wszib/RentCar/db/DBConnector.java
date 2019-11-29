package pl.edu.wszib.RentCar.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
        public static Connection connection = null;

        public static void connect(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost/wszib?user=root&password=");
            } catch(SQLException var1) {
                var1.printStackTrace();
            } catch(ClassNotFoundException var2) {
                var2.printStackTrace();
            }
        }

        public static void
}
