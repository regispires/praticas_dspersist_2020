import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exemplo5JDBCInsert {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = ConnectionFactory2.getConnection();

            PreparedStatement stmt = con.prepareStatement(
                    "insert into contatos (nome,email,endereco) values (?,?,?)");
            stmt.setString(1, "Maria");
            stmt.setString(2, "maria@gmail.com");
            stmt.setString(3, "R. Maria 123");
            int n = stmt.executeUpdate();
            System.out.println("Registros afetados: " + n);

            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
