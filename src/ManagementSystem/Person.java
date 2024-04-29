package ManagementSystem;

/**
 * 학생과 교수의 개인 정보를 표현하고 저장하기 위함
 * 개인의 다양한 정보를 저장, 가공하기 위한 메소드가 포함됩니다.
 */
public class Person {
    private String name;              // 이름 (식별자)
    private char scode;               // 성별(통계를 위해,검색에 활용)
    private int id;                   // 학번 및 교직원번호(식별자)
    private String password;          // 비밀번호(개인이 접속을 하기위한 수단)
    private String major;             // 전공(검색에 활용)
    private String tellnumber;        // 전화번호(검색에 활용)
    private String email;             // 이메일(검색에 활용)
    private String address;           // 주소(검색에 활용)
                                       // 학번과 이름을 중심으로 데이타를 추출할 예정

    public Person() {
    }

    public Person(String name, char scode, int id, String password, String major, String tellnumber, String email, String address) {
        this.name = name;
        this.scode = scode;
        this.id = id;
        this.password = password;
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

    public char getScode() {
        return scode;
    }

    public void setScode(char scode) {
        this.scode = scode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

