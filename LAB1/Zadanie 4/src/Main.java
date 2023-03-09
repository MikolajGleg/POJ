import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dzien = "";
        System.out.println("Podaj numer dnia!!!");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> dzien = "Poniedziałek";
            case 2 -> dzien = "Wtorek";
            case 3 -> dzien = "Środa";
            case 4 -> dzien = "Czwartek";
            case 5 -> dzien = "Piątek";
            case 6 -> dzien = "Sobota";
            case 7 -> dzien = "Niedziela";
            default -> dzien = "Nie Podana poprawna liczba";
        }
        System.out.println(dzien);
    }
}