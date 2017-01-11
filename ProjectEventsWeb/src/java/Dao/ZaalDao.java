/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DAL.zaal;
import ViewModel.Zaal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andri
 */
@Stateless
public class ZaalDao implements ZaalDaoLocal {

    @PersistenceContext
    //@PersistenceContext(unitName = "ProjectEventsWebPU")

    //EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectEventsWebPU");
    //EntityManager em = emf.createEntityManager();
    private EntityManager em;

    @Override
    public void toevoegenZaal(Zaal zaal) {
        em.persist(zaal);
    }

    @Override
    public void wijzigenZaal(Zaal zaal) {
        em.merge(zaal);
    }

    @Override
    public void verwijderenZaal(int zaalId) {
        em.remove(getZaal(zaalId));
    }

    @Override
    public Zaal getZaal(int zaalId) {;
        return em.find(Zaal.class, zaalId);
    }

    @Override
    public List<Zaal> getAllZalen() {
        return em.createNamedQuery("Zaal.getAll").getResultList();
    }
//    @Override
//    public List<zaal> getAlleZalen() {
//        List<zaal> lstZalen = new ArrayList<>();
//
//        lstZalen = em.createNativeQuery("SELECT * FROM zaal", zaal.class).getResultList();
//
//        return lstZalen;
}
