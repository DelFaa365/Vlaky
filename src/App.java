import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sken = new Scanner(System.in);
        System.out.print("Kolik vlaků? : ");
        int pocet = sken.nextInt();
        System.out.println("jak jedou podle zastávek");
        int array [] = new int[pocet];
        for (int i = 0; i < array.length; i++) {
            array[i] = sken.nextInt();
        }

        int delka = 0;
        int poz = 0;
        int temp = 1;

        while(delka < pocet){
            delka += array[poz];
            poz += delka;
            temp++;
        }

        System.out.println(temp);
        

        
    }
}
