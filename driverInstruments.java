package instruments;

import java.util.Scanner;

public class driverInstruments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("pilih jenis instruments");
        System.out.println("1.piano");
        System.out.println("2.guitar");
        System.out.println("pilihan anda 1/2");
        int choice = scanner.nextInt();

        if (choice ==1) {
            piano piano = new piano();
            piano.nama = "Piano";
            piano.price = 15000000.0;
            piano.numStrings = 3;
            piano.pianoType = "Yamaha";

            System.out.println("\nAnda memilih piano");
            piano.print();
        } else if (choice == 2) {
            guitar guitar = new guitar();
            guitar.nama = "Gitar Elektric";
            guitar.price = 5000000.0;
            guitar.numStrings = 6;
            guitar.isElectric = true;

            System.out.println("\nAnda memilih gitar");
            guitar.print();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
        
    

