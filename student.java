public class student extends person {
    String major;
    int studentNumber;
    int score;

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public student() {
        super();
        major = "RPL";
        studentNumber = 14;
        score = 90;
    }

    public student(String nama, int age, int score, String major, int studentNumber) {
        super(nama, age);
        this.major = major;
        this.studentNumber = studentNumber;
        this.score = score;
    }

        public void print(){
            System.out.println("major " + major);
        System.out.println("studentNumber" + studentNumber);
        System.out.println("score" + score);
    }

}
