import java.util.List;

public class ExemploInsertDAO {
    public static void main(String[] args) {
        ContatoDAO contatoDAO = new ContatoJPADAO();
        Contato c = new Contato("Maria José", "mariajose@gmail.com", "R. Maria Jose 123");
        contatoDAO.adiciona(c);
    }
}
