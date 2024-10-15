package instruments;

public class instruments {
    protected String nama;
    protected double price;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
        
    }

    public instruments(){
        nama = "gitar";
        price =  900.000;
    }

    public instruments(String nama, double price){
        this.nama = nama;
        this.price = price;
    }

    public void print() {

        System.out.println("nama " + nama);
        System.out.println("price" + price);
    }

}
