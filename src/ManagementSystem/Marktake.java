package ManagementSystem;
// 학점클래스
public class Marktake {
    private String id;		//학번 : 학번으로  Person클래스와 연계해 검색해 볼 생각이였으나 수정을 해도 연계실폐
    private String subject;	//과목코드
    private String score;	//점수

    public Marktake() {
    }

    public Marktake(String id, String subject, String score) {
        this.id = id;
        this.subject = subject;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Marktake{" +
                "id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}