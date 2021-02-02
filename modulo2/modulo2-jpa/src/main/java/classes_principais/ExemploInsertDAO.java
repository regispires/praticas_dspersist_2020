package classes_principais;

import dao.ContatoDAO;
import dao.ContatoJPADAOComJPAUtil;
import entity.Contato;

public class ExemploInsertDAO {
    public static void main(String[] args) {
        //dao.ContatoDAO contatoDAO = new dao.ContatoJDBCDAO();
        //dao.ContatoDAO contatoDAO = new dao.ContatoJPADAO();
        ContatoDAO contatoDAO = new ContatoJPADAOComJPAUtil();

        Contato c = new Contato("Maria José", "mariajose@gmail.com", "R. Maria Jose 123");
        contatoDAO.adiciona(c);
    }
}
