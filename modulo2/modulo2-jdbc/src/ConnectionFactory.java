import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/contatos",
                    "postgres","postgres");
            System.out.println("Conectado");
            return conn;

        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }

}
