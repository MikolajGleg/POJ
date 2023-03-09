import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe!");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double fahrenheit = (9.0/5) * input + 32;

        System.out.println(input + " stopnie Celsjusza to " + fahrenheit + " F");
    }
}