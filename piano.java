package instruments;

public class piano extends instruments {
    String pianoType;
    public int numStrings;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public piano(){
        super();
        pianoType = "Yamaha";
    }
     
    public piano (String pianoType , String nama, double price){
        super(nama,price);
        this.pianoType = pianoType;
    }

    public void print(){
        super.print();
        System.out.println("pianotype" + pianoType);
    }

}
