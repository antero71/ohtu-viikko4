/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antero Oikkonen
 */
public class TiedostonLukija {

    private String tiedosto;

    public TiedostonLukija(String tiedosto) {
        this.tiedosto = tiedosto;
    }

    public String hakeRivi() {

        BufferedReader in = null;
        try {
            in
                    = new BufferedReader(new FileReader(tiedosto));

            return in.readLine();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(TiedostonLukija.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
