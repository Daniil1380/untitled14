import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MainWithDao {

    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres",
                        "postgres", "qwerty"); //сделали соединение с БД

        CarDAO carDAO = new CarDAO(connection); //Создали DAO

        List<Car> cars = carDAO.getAllCars(); //получили все машины
    }
}
