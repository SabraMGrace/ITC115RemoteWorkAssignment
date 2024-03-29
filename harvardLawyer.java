/* Sabra Grace
ITC 115 Remote Work Assignment
harvardLawyer.java
November 30, 2019
*/

// extend superclass for Lawyer class.
public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return super.getSalary() * 1.2;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {
        String s = "";
        
        for (int i = 0; i < 4; i++) {
            s += super.getVacationForm();
        }
        
        return s;
    }
}
