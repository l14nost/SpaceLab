package sql.Task1;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String name = "root";
        String pass = "amir22828_Sql";
        String connectionUrl = "jdbc:mysql://localhost:3306/Shop";
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

        try (Connection connection = DriverManager.getConnection(connectionUrl,name,pass);Statement statement = connection.createStatement()){
            {
//,(2,'Chicken,Water,Oil',205),(3,'Beer,Chicken,Flour',180),(4,'Chicken,Chicken,Flour,Flour,Water,Water,Coca-Cola,Chocolate',415)
//                statement.executeUpdate("CREATE TABLE products(id INT NOT NULL AUTO_INCREMENT, name VARCHAR(100) NOT NULL , price INT NOT NULL , PRIMARY KEY (id));");
//               statement.executeUpdate("INSERT INTO order1 (idUser, productName, sum) VALUES (4,'Chicken,Chicken,Flour,Flour,Water,Water,Coca-Cola,Chocolate',415)");
                statement.execute("SELECT idUser,login,productName,sum FROM order1 o LEFT JOIN users u ON o.idUser = u.idUsers");
                ResultSet resultSet = statement.executeQuery("SELECT  * FROM order1");
                while (resultSet.next()){
                    System.out.println(resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
                }


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
