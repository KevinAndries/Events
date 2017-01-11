/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ViewModel.Zaal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author andri
 */
@Local
public interface ZaalDaoLocal {

    void toevoegenZaal(Zaal zaal);

    void wijzigenZaal(Zaal zaal);

    void verwijderenZaal(int zaalId);

    Zaal getZaal(int zaalId);

    List<Zaal> getAllZalen();
    
}
