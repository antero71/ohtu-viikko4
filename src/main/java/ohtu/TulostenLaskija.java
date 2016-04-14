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
public class TulostenLaskija {

    private Submission sub;
    private int maara;
    private ArrayList<Integer> tehdytTehtavat;

    public TulostenLaskija(Submission sub) {
        this.sub = sub;
        tehdytTehtavat = new ArrayList<Integer>();
    }

    public int getMaara() {
        return maara;
    }

    

    public ArrayList<Integer> getTehdytTehtavat() {
        return tehdytTehtavat;
    }

    public int laskeTehtavat() {

        if (sub.isA1()) {
            maara++;
            tehdytTehtavat.add(1);
        }
        if (sub.isA2()) {
            maara++;
            tehdytTehtavat.add(2);

        }
        if (sub.isA3()) {
            maara++;
            tehdytTehtavat.add(3);
        }
        if (sub.isA4()) {
            maara++;
            tehdytTehtavat.add(4);
        }
        if (sub.isA5()) {
            maara++;
            tehdytTehtavat.add(5);
        }
        if (sub.isA6()) {
            maara++;
            tehdytTehtavat.add(6);
        }
        if (sub.isA7()) {
            maara++;
            tehdytTehtavat.add(7);
        }
        if (sub.isA8()) {
            maara++;
            tehdytTehtavat.add(8);
        }
        if (sub.isA9()) {
            maara++;
            tehdytTehtavat.add(9);
        }
        if (sub.isA10()) {
            maara++;
            tehdytTehtavat.add(10);
        }
        if (sub.isA11()) {
            maara++;
            tehdytTehtavat.add(11);
        }
        if (sub.isA12()) {
            maara++;
            tehdytTehtavat.add(12);
        }
        if (sub.isA13()) {
            maara++;
            tehdytTehtavat.add(13);
        }
        if (sub.isA14()) {
            maara++;
            tehdytTehtavat.add(14);
        }
        if (sub.isA15()) {
            maara++;
            tehdytTehtavat.add(15);
        }
        if (sub.isA16()) {
            maara++;
            tehdytTehtavat.add(16);
        }
        if (sub.isA17()) {
            maara++;
            tehdytTehtavat.add(17);
        }
        if (sub.isA18()) {
            maara++;
            tehdytTehtavat.add(18);
        }
        if (sub.isA19()) {
            maara++;
            tehdytTehtavat.add(19);
        }
        if (sub.isA20()) {
            maara++;
            tehdytTehtavat.add(20);
        }
        if (sub.isA21()) {
            maara++;
            tehdytTehtavat.add(21);
        }

        return maara;
    }

    public int getViikko() {
        return this.sub.getWeek();
    }

    public int getTunnit() {
       return sub.getHours();
    }

}
