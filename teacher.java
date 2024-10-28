public class teacher extends PERSON {
    private String Subject;

    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public teacher() {
        super();
        Subject = "RPL";
    }

    public teacher(String Subject, String nama, int age) {
        super(nama, age);
        this.Subject = Subject;

    }

   public void print(){
    System.out.println("subject" + Subject);
   }
}
