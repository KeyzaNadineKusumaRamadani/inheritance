public class partTime {
    int hoursworked;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public partTime(){
        super();
        hoursworked = 0;
    }
     public partTime( String unit, int anualSalary, String Subject, String nama, int age){
        super() ;
        this.hoursworked = hoursworked;
    }
     
     public int setSalary(){
        int salary = hoursworked*1000000;
        return salary;
    }

    public void print(){
        System.out.println("hoursworked" + hoursworked);
    }
}

