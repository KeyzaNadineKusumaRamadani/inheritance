package instruments;

public class StringInstruments extends instruments {
    int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public StringInstruments(){
        super();
        numStrings = 3;
    }

    public StringInstruments( String nama,int numStrings, double price){
        super(nama, price);
        this.numStrings = numStrings;
    }

    public void print(){
        super.print();
        System.out.println("numString" + numStrings);
    }



}
