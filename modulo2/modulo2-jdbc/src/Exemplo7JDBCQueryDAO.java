import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Exemplo7JDBCQueryDAO {
    public static void main(String[] args) {

        ContatoDAO contatoDAO = new ContatoDAO();
        List<Contato> contatos = contatoDAO.getLista();

        for (Contato c : contatos) {
            System.out.println(c);
        }

    }
}
