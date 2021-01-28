import java.util.List;

public class Exemplo8JDBCQueryDAOPagina {
    public static void main(String[] args) {

        ContatoDAO contatoDAO = new ContatoDAO();
        List<Contato> contatos = contatoDAO.getListaPaginada(2, 2);

        for (Contato c : contatos) {
            System.out.println(c);
        }

    }
}
