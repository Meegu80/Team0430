package ManagementSystem;

public class Person {
    private String name;              //이름
    private int id;                   //학번 및 교직원번호
    private String major;             //전공
    private String tellnumber;        //전화번호
    private String email;             //이메일
    private String address;           //주소

    public Person() {
    }

    public Person(String name, int id, String major, String tellnumber, String email, String address) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.tellnumber = tellnumber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTellnumber() {
        return tellnumber;
    }

    public void setTellnumber(String tellnumber) {
        this.tellnumber = tellnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
