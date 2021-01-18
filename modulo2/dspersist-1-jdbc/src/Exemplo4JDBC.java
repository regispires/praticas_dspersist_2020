import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exemplo4JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = ConnectionFactory2.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from contatos");
            ResultSet rs  = ps.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                System.out.println("Id: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);
                System.out.println("Endereço: " + endereco);
            }
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
