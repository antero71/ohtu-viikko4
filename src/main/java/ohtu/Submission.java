package ohtu;

/**
 * viikko4:n ohjeet https://github.com/mluukkai/ohtu2016/wiki/laskari-4
 * @author Antero Oikkonen
 */

public class Submission {
    private String student_number;
    private String last_name;
    private String first_name;
    private int week;
    
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;
    
    private int maara=0;
    
    private int hours;

    public int getHours() {
        return hours;
    }
    
    

    public int getWeek() {
        return week;
    }

    public boolean isA1() {
        return a1;
    }

    public boolean isA2() {
        return a2;
    }

    public boolean isA3() {
        return a3;
    }

    public boolean isA4() {
        return a4;
    }

    public boolean isA5() {
        return a5;
    }

    public boolean isA6() {
        return a6;
    }

    public boolean isA7() {
        return a7;
    }

    public boolean isA8() {
        return a8;
    }

    public boolean isA9() {
        return a9;
    }

    public boolean isA10() {
        return a10;
    }

    public boolean isA11() {
        return a11;
    }

    public boolean isA12() {
        return a12;
    }

    public boolean isA13() {
        return a13;
    }

    public boolean isA14() {
        return a14;
    }

    public boolean isA15() {
        return a15;
    }

    public boolean isA16() {
        return a16;
    }

    public boolean isA17() {
        return a17;
    }

    public boolean isA18() {
        return a18;
    }

    public boolean isA19() {
        return a19;
    }

    public boolean isA20() {
        return a20;
    }

    public boolean isA21() {
        return a21;
    }

    public int getMaara() {
        return maara;
    }

    
    
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return student_number+" viikko "+week+" tehtyjä tehtäviä yhteensä: ";
    }

   
    
}