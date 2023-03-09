import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wpisz wielkosc tablicy...");
        Scanner scanner = new Scanner(System.in);
        int wielkosc = scanner.nextInt();
        String[] tablica = new String[wielkosc];



        int i = 0;
        while(i<wielkosc){

            System.out.println("Wpisz następne znaki w tablicy...");
            System.out.println("Rząd numer: " + (i+1));
            String znaki = scanner.next();
            tablica[i] = znaki;

            System.out.println(tablica[i]);
            i++;
        }

        i=0;
        System.out.println('\n');
        while(i<wielkosc){

            System.out.println(tablica[i]);

            i++;
        }
    }
}
