public class fullTime extends teacher {
    String unit;
    int anualSalary;

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

     public fullTime(){
        super();
        unit = "KURIKULUM";
        anualSalary = 700000;

     }

     public fullTime(String unit, int anualSalary, String Subject, String nama, int age){
        super(Subject, nama, age);
        this.unit = unit;
        this.anualSalary = anualSalary;
     }
       
     public void print(){
        System.out.println("unit" + unit);
        System.out.println("anualSalary" + anualSalary);
     }
}    

