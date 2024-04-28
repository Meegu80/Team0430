package ManagementSystem;

import java.util.ArrayList;

public class DataRepository {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Professor> professors = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Marktake> marktakes = new ArrayList<>();

    public DataRepository(){
        initializeData();
    }

    public void initializeData(){
        // 학생 데이터를 ArrayList에 추가
        students.add(new Student("김광식",1292001,"전자공학과","010-4843-7772","absin24@nate.com","서울"));
        students.add(new Student("박정현",1292002,"컴퓨터공학과","010-4693-8362","nhgbd324@nate.com","서울"));
        students.add(new Student("김나미",1292003,"전자공학과","010-4897-8485","abd324@nate.com","대전"));
        students.add(new Student("김현숙",1292301,"컴퓨터공학과","010-4883-8756","ciekt@nate.com","대구"));
        students.add(new Student("박광수",1292303,"경영학과","010-7693-8446","jtbd99@nate.com","광주"));
        students.add(new Student("김상철",1292305,"영어영문학과","010-5693-8472","morning24@nate.com","부산"));
        students.add(new Student("최영철",1292501,"한의학과","010-4324-8426","dasijohn@nate.com","대전"));
        students.add(new Student("백태성",1292502,"물리학과","010-9993-8432","stella@naver.com","서울"));
        // 교수 데이터를 ArrayList에 추가
        professors.add(new Professor("이태규",92001,"컴퓨터공학과","010-4654-1201","c2snow20@haksa.com","서울","교수","1997"));
        professors.add(new Professor("고희석",92002,"컴퓨터공학과","010-3464-1202","v23ert3@haksa.com","서울","교수","2003"));
        professors.add(new Professor("최성희",92301,"경영학과","010-3474-1203","b239ter0@haksa.com","대전","부교수", "2005"));
        professors.add(new Professor("김태석",92302,"전자공학과","010-7454-1204","n239gdf@haksa.com","부산","부교수", "1999"));
        professors.add(new Professor("박철재",92501,"건축공학과","010-9634-1205","j2gdf25@haksa.com","대구","교수", "2007"));
        professors.add(new Professor("장민석",92502,"정보통신공학과","010-9354-1206","kgdf20@haksa.com","광명","조교수", "2005"));

        // 학과 데이터를 ArrayList에 추가
        departments.add(new Department("전자공학과",9249, "201호"));
        departments.add(new Department("경영학과",9250, "202호"));
        departments.add(new Department("영어영문학과",9251, "203호"));
        departments.add(new Department("한의학과",9252, "204호"));
        departments.add(new Department("물리학과",9254, "301호"));
        departments.add(new Department("건축공학과",9255, "302호"));
        departments.add(new Department("컴퓨터공학과",9256, "303호"));

        // 성적 데이터를 ArrayList에 추가
        marktakes.add(new Marktake("1292001", "C101-01", "B+"));
        marktakes.add(new Marktake("1292001", "C103-01", "A+"));
        marktakes.add(new Marktake("1292001", "C301-01", "A"));
        marktakes.add(new Marktake("1292002", "C102-01", "A"));
        marktakes.add(new Marktake("1292002", "C103-01", "B+"));
        marktakes.add(new Marktake("1292002", "C502-01", "C+"));
        marktakes.add(new Marktake("1292003", "C103-02", "B"));
        marktakes.add(new Marktake("1292003", "C501-02", "A+"));
        marktakes.add(new Marktake("1292301", "C102-01", "C+"));
        marktakes.add(new Marktake("1292303", "C102-01", "C"));
        marktakes.add(new Marktake("1292303", "C103-02", "B+"));
        marktakes.add(new Marktake("1292303", "C501-01", "A+"));//
        marktakes.add(new Marktake("1292305", "C501-01", "A"));
        marktakes.add(new Marktake("1292305", "C501-02", "B+"));
        marktakes.add(new Marktake("1292305", "C501-03", "C"));
        marktakes.add(new Marktake("1292501", "C501-01", "A-"));
        marktakes.add(new Marktake("1292501", "C501-02", "B+"));
        marktakes.add(new Marktake("1292501", "C501-03", "B"));
        marktakes.add(new Marktake("1292502", "C501-01", "D"));
        marktakes.add(new Marktake("1292502", "C501-02", "A"));
        marktakes.add(new Marktake("1292502", "C501-03", "B+"));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public ArrayList<Marktake> getMarktakes() {
        return marktakes;
    }

    public void setMarktakes(ArrayList<Marktake> marktakes) {
        this.marktakes = marktakes;
    }
} //end
