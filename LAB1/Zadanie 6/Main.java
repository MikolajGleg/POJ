import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Podaj długość tablicy...");
        int dlugosc = scanner.nextInt();
        System.out.println("Podaj pierwszy element tablicy...");
        int pLiczba = scanner.nextInt();
        scanner.close();

        int[] x = new int[dlugosc];

        for (int k = 0; k < dlugosc; k++) {
            if (k == 0 && pLiczba % 2 == 1) {
                x[0] = pLiczba;
                x[1] = pLiczba + 1;
                k = 1;
                continue;
            } else if (k == 0) {
                x[0] = pLiczba;
                continue;
            } else {
                x[k] = x[k - 1] + 2;
            }

        }

        System.out.println('\n');

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        System.out.println("Min: " + smallestElement(x));
        System.out.println("Max: " + biggestElement(x));
        System.out.println("Suma: " + sumOfElements(x));
        System.out.println("Średnia: " + average(x));
        System.out.println("Mediana: " + median(x));

    }

    public static int smallestElement(int[] x) {
        return x[0];
    }

    public static int biggestElement(int[] x) {
        return x[x.length - 1];
    }

    public static int sumOfElements(int[] x) {
        int h = 0;
        for (int i = 0; i < x.length; i++) {
            h = h + x[i];
        }
        return h;
    }

    public static double average(int[] x) {
        int sum = sumOfElements(x);
        double average = sum / x.length;

        return average;
    }

    public static double median(int[] x) {
        if (x.length % 2 == 1) {// liczba po środku
            double median = x[x.length / 2];
            return median;
        } else {
            double median = x[x.length / 2 - 1] + x[x.length / 2];
            median /= 2;
            return median;
        }
    }
}