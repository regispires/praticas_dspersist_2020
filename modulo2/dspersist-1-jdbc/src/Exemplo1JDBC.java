import java.sql.*;

public class Exemplo1JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:postgresql://localhost/contatos",
                            "postgres","postgres");
            System.out.println("Conectado");
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
