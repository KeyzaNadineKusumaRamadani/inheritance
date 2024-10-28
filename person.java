public class person {
    protected String nama;
    protected int age;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public person() {
        nama = "Aksa";
        age = 17;
    }

    public person(String nama, int age) {
        this.nama = nama;
        this.age = age;
    }

    public void print() {
        System.out.println("nama " + nama);
        System.out.println("age" + age);
    }
}
