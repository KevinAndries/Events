/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BO.Afbeelding;
import BO.Zaal;
import DAL.DaZalen;
import java.util.List;

/**
 *
 * @author andri
 */
public class ZaalService {
    
    private final DaZalen da = new DaZalen();
    
    public List<Zaal> getAllZaal() {
        
        return da.getAll();
    }
        public List<Afbeelding> getAllAfbeeldingen() {
        
        return da.getAllAfbeelding();
    }
    
    public void UpdateZaal(int ID, Zaal zaal) {
        DaZalen.ZaalToevoegen(zaal);
    }
    
    public void SaveZaal (Zaal zaal) {
        
        DaZalen.ZaalToevoegen(zaal);
    }
    
    public void DeleteZaal (Zaal zaal) {
        
        DaZalen.ZaalVerwijderen(zaal);
    }
    
}
