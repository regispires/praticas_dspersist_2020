import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exemplo6JDBCQuery {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = ConnectionFactory2.getConnection();

            PreparedStatement ps = con.prepareStatement("select * from contatos");
            ResultSet rs  = ps.executeQuery();
            while(rs.next()) {
                Contato contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));
                System.out.println(contato);
            }
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
