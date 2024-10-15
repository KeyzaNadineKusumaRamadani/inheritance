package instruments;

import java.util.Scanner;

public class diverclass {
        public static void main(String[] args) {
        
        String choice = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guitar atau Piano?");
        choice = input.next();

        String nama;
        if (choice.equalsIgnoreCase("Guitar")) {
            System.out.println("Inputkan name: ");
            String name = input.next();
            System.out.println("Inputkan price: ");
            double price = input.nextDouble();
            System.out.println("Inputkan numStrings: ");
            int numStrings = input.nextInt();
            input.nextLine();
            System.out.println("apakah Electric: ");
            boolean isElectric = input.nextBoolean();
            guitar guitar2 = new guitar( name, numStrings,price, isElectric);
            guitar2.print();

        } else if (choice.equalsIgnoreCase("Piano")) {
        System.out.println("Inputkan name: ");
        String name = input.next();
        System.out.println("Inputkan price: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Inputkan pianotype: ");
        String pianoType = input.nextLine();
        piano Piano2 = new piano(pianoType, name, price);
            Piano2.print();
        } else {
            System.out.println("Pilihan yang anda masukkan salah.");

        }
        input.close();

    }

}


