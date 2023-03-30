import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj minimum zakresu liczb:");
        int zakresMin = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj maximum zakresu liczb:");
        int zakresMax = Integer.parseInt(scanner.nextLine());


        Logika nowaGra = new Logika(zakresMin,zakresMax);


        int playerGuess;

        while (!nowaGra.getPoprawnaOdpowiedz()){
            System.out.println("Podaj liczbę:");
            playerGuess = Integer.parseInt(scanner.nextLine());
            nowaGra.guess(playerGuess);
        }

    }
}