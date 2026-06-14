package config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {

    private static Connection connection;

    public static Connection getConnection(){
        String message = " Conexión exitosa con MySQL ";
        int sizeMessage = message.length();
        String caracter = "-";
        for (int i = 0; i < sizeMessage; i++) {
            caracter = caracter + caracter;
        }
        message = caracter + message + caracter;
        if (connection == null){
            try {
                Properties properties = new Properties();
                InputStream inputStream = DatabaseConnection.class
                        .getClassLoader()
                        .getResourceAsStream("db.properties");
                properties.load(inputStream);

                String url = properties.getProperty("db.url");
                String user = properties.getProperty("db.user");
                String password = properties.getProperty("db.password");

                connection = DriverManager.getConnection(url, user, password);
                System.out.println(message);




            } catch (Exception e) {
                message = "Error al conectarse a Mysql: " + e.getMessage();
                sizeMessage = message.length();
                caracter = "-";
                for (int i = 0; i < sizeMessage; i++) {
                    caracter = caracter + caracter;
                }
                message = caracter + message + caracter;
                System.out.println(message);
                throw new RuntimeException(e);
            }
        }
        return connection;
    }


}
