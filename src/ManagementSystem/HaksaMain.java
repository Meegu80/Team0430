package ManagementSystem;
import java.io.*;
import java.util.Scanner;


public class HaksaMain {

    private static DataRepository repo = new DataRepository();
    private static final String STUDENT_FILE_PATH = "C:\\students.txt";
    private static final String PROFESSOR_FILE_PATH = "C:\\professors.txt";
    private static final String MARKTAKE_FILE_PATH = "C:\\marktakes.txt";

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            loadDataFromFile();

            while (true) {
                System.out.println("=============================");
                System.out.println("행정관리 프로그램입니다.");
                System.out.println("원하는 업무를 선택해 주세요.");
                System.out.println("=============================");
                System.out.println("1. 학생 업무");
                System.out.println("2. 교수 업무");
                System.out.println("3. 학과 업무");
                System.out.println("4. 성적 업무");
                System.out.println("5. 종료");
                System.out.println("=============================");
                System.out.print("메뉴 선택: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        studentMenu();
                        break;
                    case 2:
                        professorMenu();
                        break;
                    case 3:
                        departmentMenu();
                        break;
                    case 4:
                        marktakeMenu();
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            }
        }
    //=======================================================================================================
    private static void studentMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=============================");
            System.out.println("1. 학생 정보 입력");
            System.out.println("2. 학생 정보 조회");
            System.out.println("3. 학생 정보 수정");
            System.out.println("4. 학생 정보 삭제");
            System.out.println("5. 메인 메뉴로 가기");
            System.out.println("=============================");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    registerStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

    private static void registerStudent(Scanner scanner) {
        System.out.println("이름: ");
        String name = scanner.nextLine();
        System.out.println("학번 : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("전공 : ");
        String major = scanner.nextLine();
        System.out.println("전화번호 : ");
        String tellnumber = scanner.nextLine();
        System.out.println("이메일 : ");
        String email = scanner.nextLine();
        System.out.println("주소 : ");
        String address = scanner.nextLine();

        Student student = new Student(name, id, major, tellnumber, email, address);
        repo.getStudents().add(student);
        System.out.println("학생이 성공적으로 등록되었습니다.");
    }


    private static void displayStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생의 이름 또는 학번을 입력하세요: ");
        String input = scanner.nextLine();
        boolean found = false;

        for (Student student : repo.getStudents()) {
            if (student.getName().equals(input) || String.valueOf(student.getId()).equals(input)) {
                System.out.println("학번: " + student.getId());
                System.out.println("이름: " + student.getName());
                System.out.println("전공: " + student.getMajor());
                System.out.println("전화번호: " + student.getTellnumber());
                System.out.println("이메일: " + student.getEmail());
                System.out.println("주소: " + student.getAddress());
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당하는 학생이 없습니다.");
        }
    }

    private static void updateStudent(Scanner scanner) {
        System.out.println("수정할 학생의 ID를 입력하세요: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student s : repo.getStudents()) {
            if (s.getId() == id) {
                System.out.println("새로 입력할 이름: ");
                String name = scanner.nextLine();
                System.out.println("새로 입력할 전공 : ");
                String major = scanner.nextLine();
                System.out.println("새로운 전화번호 : ");
                String tellnumber = scanner.nextLine();
                System.out.println("새로운 이메일 : ");
                String email = scanner.nextLine();
                System.out.println("새로운 주소 : ");
                String address = scanner.nextLine();

                s.setName(name);
                s.setMajor(major);
                s.setTellnumber(tellnumber);
                s.setEmail(email);
                s.setAddress(address);
                System.out.println("학생 정보가 업데이트 되었습니다.");
                return;
            }
        }
        System.out.println("해당 ID의 학생을 찾을 수 없습니다.");
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.println("삭제할 학생의 ID를 입력하세요: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < repo.getStudents().size(); i++) {
            if (repo.getStudents().get(i).getId() == id) {
                repo.getStudents().remove(i);
                System.out.println("학생 정보가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 ID의 학생을 찾을 수 없습니다.");
    }

    private static void professorMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=============================");
            System.out.println("1. 교수 정보 입력");
            System.out.println("2. 교수 정보 조회");
            System.out.println("3. 교수 정보 수정");
            System.out.println("4. 교수 정보 삭제");
            System.out.println("5. 메인 메뉴로 가기");
            System.out.println("=============================");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    // 교수 정보 입력 메소드 호출
                    registerProfessor(scanner);
                    break;
                case 2:
                    // 교수 정보 조회 메소드 호출
                    displayProfessors();
                    break;
                case 3:
                    // 교수 정보 수정 메소드 호출
                    updateProfessor(scanner);
                    break;
                case 4:
                    // 교수 정보 삭제 메소드 호출
                    deleteProfessor(scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

    }
    private static void registerProfessor(Scanner scanner) {
        System.out.println("이름: ");
        String name = scanner.nextLine();
        System.out.println("교직원번호 : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("전공 : ");
        String major = scanner.nextLine();
        System.out.println("전화번호 : ");
        String tellnumber = scanner.nextLine();
        System.out.println("이메일 : ");
        String email = scanner.nextLine();
        System.out.println("주소 : ");
        String address = scanner.nextLine();
        System.out.println("직급: ");
        String grade = scanner.nextLine();
        System.out.println("입사일자: ");
        String hiredate = scanner.nextLine();

        Professor professor = new Professor(name, id, major, tellnumber, email, address, grade, hiredate);
        repo.getProfessors().add(professor);
        System.out.println("교수가 성공적으로 등록되었습니다.");
    }

    private static void updateProfessor(Scanner scanner) {
        System.out.println("수정할 교수의 교직원번호를 입력하세요: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Professor professor : repo.getProfessors()) {
            if (professor.getId() == id) {
                System.out.println("새로 입력할 이름: ");
                String name = scanner.nextLine();
                System.out.println("새로 입력할 전공 : ");
                String major = scanner.nextLine();
                System.out.println("새로운 전화번호 : ");
                String tellnumber = scanner.nextLine();
                System.out.println("새로운 이메일 : ");
                String email = scanner.nextLine();
                System.out.println("새로운 주소 : ");
                String address = scanner.nextLine();

                professor.setName(name);
                professor.setMajor(major);
                professor.setTellnumber(tellnumber);
                professor.setEmail(email);
                professor.setAddress(address);
                System.out.println("교수 정보가 업데이트 되었습니다.");
                return;
            }
        }
        System.out.println("해당 교직원번호의 교수를 찾을 수 없습니다.");
    }

    private static void displayProfessors() {
        System.out.println("등록된 교수 목록:");
        for (Professor professor : repo.getProfessors()) {
            System.out.println(professor.getId() + " " + professor.getName() + " " + professor.getMajor() + " " + professor.getTellnumber()
                    + " " + professor.getEmail() + " " + professor.getAddress());
        }
    }



    private static void deleteProfessor(Scanner scanner) {
        System.out.println("삭제할 교수의 교직원번호를 입력하세요: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < repo.getProfessors().size(); i++) {
            if (repo.getProfessors().get(i).getId() == id) {
                repo.getProfessors().remove(i);
                System.out.println("교수 정보가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 교직원번호의 교수를 찾을 수 없습니다.");
    }




    //===================================================================================================
    private static void marktakeMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=============================");
            System.out.println("1. 성적 입력");
            System.out.println("2. 성적 조회");
            System.out.println("3. 메인 메뉴로 가기");
            System.out.println("=============================");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    // 성적 입력 메소드 호출
                    enterMarks(scanner);
                    break;
                case 2:
                    // 성적 조회 메소드 호출
                    displayMarks();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

    private static void enterMarks(Scanner scanner) {
        System.out.println("학번: ");
        String id = scanner.nextLine();
        System.out.println("과목코드: ");
        String subject = scanner.nextLine();
        System.out.println("점수: ");
        String score = scanner.nextLine();

        // 입력받은 정보로 Marktake 객체 생성
        Marktake marktake = new Marktake(id, subject, score);

        // 데이터 저장소에 성적 정보 추가
        repo.getMarktakes().add(marktake);

        System.out.println("성적이 성공적으로 입력되었습니다.");
    }

    private static void displayMarks() {
        System.out.println("등록된 성적 목록:");
        for (Marktake marktake : repo.getMarktakes()) {
            System.out.println("학번: " + marktake.getId() + ", 과목코드: " + marktake.getSubject() + ", 점수: " + marktake.getScore());
        }
    }
    //===================================================================================================
    private static void departmentMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=============================");
            System.out.println("1. 학과 정보 조회");
            System.out.println("2. 학과 정보 수정");
            System.out.println("3. 학과 정보 입력");
            System.out.println("4. 메인 메뉴로 가기");
            System.out.println("=============================");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    displayDepartments();
                    break;
                case 2:
                    updateDepartment(scanner);
                    break;
                case 3:
                    registerDepartment(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

    private static void displayDepartments() {
        System.out.println("등록된 학과 목록:");
        for (Department department : repo.getDepartments()) {
            System.out.println(department.getMjNum() + " " + department.getMajor() + " " + department.getOffice());
        }
    }

    private static void registerDepartment(Scanner scanner) {
        System.out.println("학과명: ");
        String major = scanner.nextLine();
        System.out.println("학과코드: ");
        int mjNum = Integer.parseInt(scanner.nextLine());
        System.out.println("사무실 호수: ");
        String office = scanner.nextLine();

        Department department = new Department(major, mjNum, office);
        repo.getDepartments().add(department);
        System.out.println("학과가 성공적으로 등록되었습니다.");
    }

    private static void updateDepartment(Scanner scanner) {
        System.out.println("수정할 학과의 이름을 입력하세요: ");
        String major = scanner.nextLine();

        for (Department department : repo.getDepartments()) {
            if (department.getMajor().equals(major)) {
                System.out.println("새로 입력할 학과 코드: ");
                int mjNum = Integer.parseInt(scanner.nextLine());
                System.out.println("새로 입력할 사무실 호수: ");
                String office = scanner.nextLine();

                department.setMjNum(mjNum);
                department.setOffice(office);
                System.out.println("학과 정보가 업데이트 되었습니다.");
                return;
            }
        }
        System.out.println("해당 이름의 학과를 찾을 수 없습니다.");
    }
    private static void loadDataFromFile() {
        loadStudentsFromFile();
        loadProfessorsFromFile();
        loadMarktakesFromFile();
    }

    private static void loadStudentsFromFile() {
        try (Scanner scanner = new Scanner(new File(STUDENT_FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    Student student = new Student(parts[1], Integer.parseInt(parts[0]), parts[2], parts[3], parts[4], parts[5]);
                    repo.getStudents().add(student);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("학생 파일을 찾을 수 없습니다.");
        }
    }

    private static void loadProfessorsFromFile() {
        try (Scanner scanner = new Scanner(new File(PROFESSOR_FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 8) {
                    Professor professor = new Professor(parts[1], Integer.parseInt(parts[0]), parts[2], parts[3],
                            parts[4], parts[5], parts[6], parts[7]);
                    repo.getProfessors().add(professor);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("교수 파일을 찾을 수 없습니다.");
        }
    }

    private static void loadMarktakesFromFile() {
        try (Scanner scanner = new Scanner(new File(MARKTAKE_FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Marktake marktake = new Marktake(parts[0], parts[1], parts[2]);
                    repo.getMarktakes().add(marktake);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("성적 파일을 찾을 수 없습니다.");
        }
    }


}   // end of class SchoolManagementEx