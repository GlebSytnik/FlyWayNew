import org.flywaydb.core.Flyway;

import java.sql.SQLException;

public class Migration {

    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gym?serverTimezone=UTC";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Flyway flyway = Flyway.configure().dataSource(DB_URL, DB_USERNAME, DB_PASSWORD).load();
        flyway.clean();
        flyway.baseline();
        flyway.migrate();
    }
}