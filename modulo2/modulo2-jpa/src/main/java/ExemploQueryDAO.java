import java.util.List;

public class ExemploQueryDAO {
    public static void main(String[] args) {

        //ContatoDAO contatoDAO = new ContatoJDBCDAO();
        //ContatoDAO contatoDAO = new ContatoJPADAO();
        ContatoDAO contatoDAO = new ContatoJPADAOComJPAUtil();

        List<Contato> contatos = contatoDAO.getLista();

        for (Contato c : contatos) {
            System.out.println(c);
        }

    }
}
