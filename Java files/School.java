import java.util.ArrayList;
public class School{

    private String name;
    private int maxEnrollment;
    private ArrayList<Student> roster;

    public School(String n, int maxEnrollment){
        this.name = n;
        this.maxEnrollment = maxEnrollment;
        this.roster = new ArrayList<Student> ();
    }

    public void enrollStudent(Student s){
        if(this.roster.contains(s)){
            throw new RuntimeException(s.getName() + " is already enrolled at " + this.name);
        }
        this.roster.add(s);
        if(this.roster.size() >= this.maxEnrollment){
            throw new RuntimeException(this.name + " is already at maximum capacity.Try next semester? ");
        }
        this.roster.add(s);

    }

    public void dropStudent(Student s){
        if(!this.roster.contains(s)){
            throw new RuntimeException(s.getName() + " is not enrolled at " + this.name);
        }
        this.roster.remove(s);
    }

    public int getNumEnrolled(){
        return this.roster.size();
    }

    public int getRemainingSpots(){
        return this.maxEnrollment - this.getNumEnrolled();
    }

    public String toString(){
        return this.name + " has a current enrollment of " + String.valueOf(this.getNumEnrolled()) + " and has " + StringlvalueOf(this.getNumEnrolled()) +" seats remaining ";
    }

    public static void main(String[]args){
        School smith = new School("Smith College", 2800);
    }


}