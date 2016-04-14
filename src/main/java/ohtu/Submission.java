package ohtu;

/**
 * viikko4:n ohjeet https://github.com/mluukkai/ohtu2016/wiki/laskari-4
 * @author Antero Oikkonen
 */

public class Submission {
    private String student_number;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return student_number;
    }
    
}