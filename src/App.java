import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Počet zastávek");
        int pocetZastavek = sc.nextInt();
        System.out.println("Zadej jednotlivé vlaky");
        for (int t=0; t<pocetZastavek; t++) {
          int[] vlaky = new int[pocetZastavek];
          for (int i=0; i<pocetZastavek; i++) {
            vlaky[i] = sc.nextInt();
          }
          int pocet = 0;    
          int aktualni = 0;  
          while (aktualni < pocetZastavek-1) {
            aktualni += vlaky[aktualni];
            pocet++;
          }
          System.out.println(pocet);
        }
    }
}
