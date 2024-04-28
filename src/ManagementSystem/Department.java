package ManagementSystem;

public class Department {
    private String major;   //학과명
    private int mjNum;      //학과코드
    private String office;   // 사무실호수

    public Department() {
    }

    public Department(String major, int mjNum, String office) {
        this.major = major;
        this.mjNum = mjNum;
        this.office = office;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getMjNum() {
        return mjNum;
    }

    public void setMjNum(int mjNum) {
        this.mjNum = mjNum;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Department{" +
                "major='" + major + '\'' +
                ", mjNum=" + mjNum +
                ", office='" + office + '\'' +
                '}';
    }
}
