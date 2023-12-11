import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "qwerty");
        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS abc (id int)");
        ResultSet resultSet = statement.executeQuery("SELECT * from car");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString(3));
        }

        System.out.println("Подключено");
    }
}
