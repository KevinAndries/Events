package EJB;

import DAL.afbeelding;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AfbeeldingEJB {

    @PersistenceContext(unitName = "ProjectEventsWebPU")
    private EntityManager em;
    
    public List<afbeelding> getAlleAfbeeldingen() {
        List<afbeelding> lstAfbeeldingen = new ArrayList<>();
        
        lstAfbeeldingen = em.createNativeQuery("SELECT * FROM afbeelding", afbeelding.class). getResultList();
        
        return lstAfbeeldingen;
    }
    
}
