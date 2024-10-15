package instruments;

public class guitar extends StringInstruments{
    boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
     
    public guitar(String nama, int numStrings, double price, boolean isElectric){
        super(nama, numStrings, price);
        this.isElectric = isElectric;
    }

    public guitar(){
        super();
        isElectric = true;
    }

   public void print(){
    super.print();
    System.out.println("IsElectric:" + isElectric);
   }
}

