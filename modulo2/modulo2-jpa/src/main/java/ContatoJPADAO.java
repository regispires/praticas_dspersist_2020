import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ContatoJPADAO implements ContatoDAO {
    public void adiciona(Contato contato) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(contato);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Contato> getLista() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Contato> l = em.createQuery("select c from Contato as c", Contato.class).getResultList();
        em.close();
        return l;
    }

    public List<Contato> getListaPaginada(int pagina, int tamanhoPagina) {
        return null;
    }

}

