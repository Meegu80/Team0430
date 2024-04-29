package ManagementSystem;

public class Professor extends Person{
    private String grade;
    private String hiredate;

    public Professor(){
    }

    public Professor(String name, char scode, int id, String password, String major, String tellnumber, String email, String address, String grade, String hiredate) {
        super(name, scode, id, password, major, tellnumber, email, address);
        this.grade = grade;
        this.hiredate = hiredate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}

