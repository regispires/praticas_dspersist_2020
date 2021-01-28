import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ContatoJPADAOComJPAUtil implements ContatoDAO {
    public void adiciona(Contato contato) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            JPAUtil.beginTransaction();
            em.persist(contato);
            JPAUtil.commit();
        } catch (Exception e) {
            JPAUtil.rollback();
            e.printStackTrace();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Contato> getLista() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Contato> l = em.createQuery("select c from Contato as c", Contato.class).getResultList();
        JPAUtil.closeEntityManager();
        return l;
    }

    public List<Contato> getListaPaginada(int pagina, int tamanhoPagina) {
        return null;
    }

}

