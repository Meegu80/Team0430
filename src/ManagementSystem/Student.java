package ManagementSystem;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int id, String major, String tellnumber, String email, String address) {
        super(name, id, major, tellnumber, email, address);
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}
