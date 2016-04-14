/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import java.util.ArrayList;

/**
 *
 * @author Antero Oikkonen
 */
public class TulostuksenMuotoilija {
    
    private TulostenLaskija laskija;
    int maara = 0;

    public TulostuksenMuotoilija(TulostenLaskija laskija) {
        this.laskija = laskija;
    }
    
    
    public String getTehdytTehtavat(){
        maara = laskija.laskeTehtavat();
        ArrayList <Integer>tehtavat = laskija.getTehdytTehtavat();
        StringBuffer b = new StringBuffer();
        for(Integer i:tehtavat){
            b.append(i);
            b.append(" ");
        }
        return b.toString();
    }
    
    public String getYhteenvetoViikosta(){
        StringBuffer b = new StringBuffer("viikko ");
        b.append(laskija.getViikko());
        b.append(": tehtyjä tehtäviä yhteensä: ");
        b.append(maara);
        b.append(", aikaa kului ");
        b.append(laskija.getTunnit());
        b.append(" tuntia, tehdyt tehtävät:");
        return b.toString();
    }
    
    
    
    
    
    
}
