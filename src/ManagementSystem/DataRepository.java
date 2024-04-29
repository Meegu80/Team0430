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
        students.add(new Student("김민지", 'F', 1292000, "Mg7qy$73", "컴퓨터공학과", "010-1243-4567", "yugwansoon@example.com", "서울"));
        students.add(new Student("신사임당", 'F', 1292001, "Gk&Lp12@", "경영학과", "010-2345-6789", "shinsaimdang@example.com", "부산"));
        students.add(new Student("김구", 'M', 1292002, "LpN9*#2f", "전자공학과", "010-3456-7890", "sejong@example.com", "대구"));
        students.add(new Student("이순신", 'M', 1292003, "sD2F@14s", "신소재공학과", "010-4567-8901", "leesoonshin@example.com", "대전"));
        students.add(new Student("이황", 'M', 1292004, "pwQ32D!q", "화학공학과", "010-5678-9012", "leehwang@example.com", "광주"));
        students.add(new Student("장영실", 'M', 1292005, "Jg#8dKf9", "기계공학과", "010-6789-0123", "jangyoungsil@example.com", "인천"));
        students.add(new Student("연개소문", 'M', 1292006, "hN23q&As", "신소재공학과", "010-7890-1234", "yeongaesomun@example.com", "대구"));
        students.add(new Student("김정일", 'M', 1292007, "Kd$#e3W!", "전기공학과", "010-8901-2345", "kimsin@example.com", "울산"));
        students.add(new Student("홍길동", 'M', 1292008, "yS#1pQ2a", "경영학과", "010-9012-3456", "honggildong@example.com", "부산"));
        students.add(new Student("강감찬", 'M', 1292009, "a3!Gd2$f", "전자공학과", "010-0123-4567", "kanggam@example.com", "대전"));
        students.add(new Student("을지문", 'M', 1292010, "dF2%kaL9", "컴퓨터공학과", "010-1234-5678", "kimdaejung@example.com", "대구"));
        students.add(new Student("이승환", 'M', 1292011, "M3!f#vq8", "신소재공학과", "010-2345-6789", "nomuhyun@example.com", "서울"));
        students.add(new Student("박정현", 'M', 1292012, "fS2@kG4r", "전자공학과", "010-3456-7890", "parkjunghyun@example.com", "대전"));
        students.add(new Student("김현숙", 'F', 1292013, "pDq2G^2t", "신소재공학과", "010-4567-8901", "kimhyunsook@example.com", "부산"));
        students.add(new Student("김상철", 'M', 1292014, "sM2&k9#h", "컴퓨터공학과", "010-5678-9012", "kimsangcheol@example.com", "대구"));
        students.add(new Student("백태성", 'M', 1292015, "qDl7^2*G", "기계공학과", "010-6789-0123", "baektaseong@example.com", "서울"));
        students.add(new Student("최영철", 'M', 1292016, "aD2%fsP3", "화학공학과", "010-7890-1234", "choiyoungcheol@example.com", "대전"));
        students.add(new Student("김나미", 'F', 1292017, "P3Dq#N2k", "컴퓨터공학과", "010-8901-2345", "kimnami@example.com", "대구"));
        students.add(new Student("김영철", 'M', 1292018, "D8!d3Kf$", "신소재공학과", "010-9012-3456", "leemyungbak@example.com", "서울"));
        students.add(new Student("최 승", 'M', 1292019, "G5*!qP2D", "기계공학과", "010-0123-4567", "nomuhyun@example.com", "부산"));
        students.add(new Student("서연우", 'F', 1292020, "A2#kF3q", "전자공학과", "010-1234-5678", "parkjunghyun@example.com", "대전"));
        students.add(new Student("지유진", 'M', 1292021, "N1#k2@3f", "신소재공학과", "010-2345-6789", "kimnami@example.com", "서울"));
        students.add(new Student("김상철", 'M', 1292022, "S3$2@W!e", "컴퓨터공학과", "010-3456-7890", "kimsangcheol@example.com", "부산"));
        students.add(new Student("임서영", 'F', 1292023, "D2%kF3q2", "화학공학과", "010-4567-8901", "kimdaejung@example.com", "대전"));
        students.add(new Student("육백만", 'M', 1292024, "qW!2%4sD", "전자공학과", "010-5678-9012", "kimhyunsook@example.com", "서울"));
        students.add(new Student("민서진", 'F', 1292025, "aS2D!8#f", "컴퓨터공학과", "010-6789-0123", "leehwang@example.com", "대구"));
        students.add(new Student("김원빈", 'M', 1292026, "Pw3D!q2@", "기계공학과", "010-7890-1234", "shinsaimdang@example.com", "서울"));
        students.add(new Student("박수종", 'M', 1292027, "2dSf#q3Q", "신소재공학과", "010-8901-2345", "sejong@example.com", "부산"));
        students.add(new Student("이희라", 'F', 1292028, "1Q2@fD3g", "화학공학과", "010-9012-3456", "yugwansoon@example.com", "대전"));
        students.add(new Student("박제동", 'M', 1292029, "3R@2%wDq", "컴퓨터공학과", "010-0123-4567", "honggildong@example.com", "서울"));
        students.add(new Student("남 진", 'M', 1292030, "1Sd2#Qw@", "기계공학과", "010-1234-5678", "leesoonshin@example.com", "대구"));
        students.add(new Student("성진우", 'M', 1292031, "Dq2@!fS3", "전자공학과", "010-2345-6789", "baektaseong@example.com", "부산"));
        students.add(new Student("장영실", 'M', 1292032, "2Qd3%fwS", "컴퓨터공학과", "010-3456-7890", "jangyoungsil@example.com", "대전"));
        students.add(new Student("와타나베", 'M', 1292033, "wS3D#4!2", "전자공학과", "010-4567-8901", "kimsin@example.com", "부산"));
        students.add(new Student("김수로", 'M', 1292034, "1S2Df@#3", "신소재공학과", "010-5678-9012", "kanggam@example.com", "서울"));
        students.add(new Student("단군", 'M', 1292035, "3D!fQ2d@", "화학공학과", "010-6789-0123", "kimnami@example.com", "대전"));
        students.add(new Student("왕건", 'M', 1292036, "2Q#3fDw!", "컴퓨터공학과", "010-7890-1234", "choiyoungcheol@example.com", "서울"));
        students.add(new Student("이을용", 'M', 1292037, "4!2Dw@3Q", "전자공학과", "010-8901-2345", "nomuhyun@example.com", "부산"));
        students.add(new Student("김수철", 'M', 1292038, "wE3@2DfQ", "화학공학과", "010-9012-3456", "kimsangcheol@example.com", "대구"));
        students.add(new Student("유상철", 'M', 1292039, "qW3D2%f@", "컴퓨터공학과", "010-0123-4567", "kimhyunsook@example.com", "서울"));
        students.add(new Student("안정환", 'M', 1292040, "2@d3fQ!w", "전자공학과", "010-1234-5678", "parkjunghyun@example.com", "대전"));
        // 교수 데이터를 ArrayList에 추가
        professors.add(new Professor("이태규", 'M', 92001, "prof123", "컴퓨터공학과", "010-4654-1201", "c2snow20@haksa.com", "서울", "교수", "1997"));
        professors.add(new Professor("전소민", 'F', 92002, "prof456", "컴퓨터공학과", "010-3464-1202", "v23ert3@haksa.com", "서울", "교수", "2003"));
        professors.add(new Professor("유재석", 'M', 92301, "prof789", "경영학과", "010-3474-1203", "b239ter0@haksa.com", "대전", "부교수", "2005"));
        professors.add(new Professor("이광수", 'M', 92302, "prof321", "전자공학과", "010-7454-1204", "n239gdf@haksa.com", "부산", "부교수", "1999"));
        professors.add(new Professor("아이유", 'F', 92501, "prof654", "건축공학과", "010-9634-1205", "j2gdf25@haksa.com", "대구", "교수", "2007"));
        professors.add(new Professor("이하늬", 'F', 92502, "prof987", "정보통신공학과", "010-9354-1206", "kgdf20@haksa.com", "광명", "조교수", "2005"));
        professors.add(new Professor("송중기", 'M', 92003, "prof246", "컴퓨터공학과", "010-4654-1201", "c2snow20@haksa.com", "서울", "교수", "1997"));
        professors.add(new Professor("한지민", 'F', 92004, "prof135", "컴퓨터공학과", "010-3464-1202", "v23ert3@haksa.com", "서울", "교수", "2003"));
        professors.add(new Professor("조정석", 'M', 92303, "prof579", "경영학과", "010-3474-1203", "b239ter0@haksa.com", "대전", "부교수", "2005"));
        professors.add(new Professor("박보검", 'M', 92304, "prof753", "전자공학과", "010-7454-1204", "n239gdf@haksa.com", "부산", "부교수", "1999"));
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
        marktakes.add(new Marktake("1292002", "C102-01", "A"));
        marktakes.add(new Marktake("1292003", "C103-02", "B"));
        marktakes.add(new Marktake("1292301", "C102-01", "C+"));
        marktakes.add(new Marktake("1292303", "C102-01", "C"));
        marktakes.add(new Marktake("1292305", "C501-01", "A"));
        marktakes.add(new Marktake("1292501", "C501-01", "A-"));
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
