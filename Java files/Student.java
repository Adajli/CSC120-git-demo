public class Student {
    private String name;
    private School schoolAttended;

    public Student(String n, School s){
        this.name = n;
        this.schoolAttended = s;
    }

    public String getName(){
        return this.name;
    }

    public School getSchool(){
        return this.schoolAttended;
    }
}
