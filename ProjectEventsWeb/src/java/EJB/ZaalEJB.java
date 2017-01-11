package EJB;

import DAL.zaal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ZaalEJB {

    @PersistenceContext(unitName = "ProjectEventsWebPU")
    private EntityManager em;
    
    public List<zaal> getAlleZalen() {
        List<zaal> lstZalen = new ArrayList<>();
        
        lstZalen = em.createNativeQuery("SELECT * FROM zaal", zaal.class). getResultList();
        
        return lstZalen;
    }
    
}
