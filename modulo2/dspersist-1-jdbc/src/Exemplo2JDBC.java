import java.sql.*;

public class Exemplo2JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:postgresql://localhost/contatos",
                            "postgres","postgres");
            System.out.println("Conectado");
            PreparedStatement ps = con.prepareStatement("select * from clientes");
            ResultSet rs  = ps.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                double renda = rs.getDouble("renda");
                System.out.println("Id: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Fone: " + fone);
                System.out.println("Renda: " + renda);
            }
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
