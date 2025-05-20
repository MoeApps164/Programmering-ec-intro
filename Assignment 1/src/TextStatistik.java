import java.util.Scanner;

public class TextStatistik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int radAntal = 0;
        int teckenAntal = 0;

        System.out.println("Skriv text (stop för att avsluta):");
        String input = scan.nextLine(); // första raden måste läsas in innan loopen

        while (!input.equals("stop")) {
            radAntal++;                          // räkna rad
            teckenAntal += input.length();       // räkna tecken

            input = scan.nextLine();             // läs nästa rad
        }

        System.out.println("Antal rader: " + radAntal);
        System.out.println("Antal tecken: " + teckenAntal);
    }
}




