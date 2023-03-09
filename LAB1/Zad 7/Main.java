public class Main {
    public static void main(String[] args) {
        System.out.println(dzielnik(22, 11));
    }

    public static int dzielnik(int x, int y) {
        int a = 1;
        int b = 1;

        while (a <= x || a <= y) {
            if (x % a == 0 && y % a == 0) {
                b = a;

            }
            a++;
        }

        return b;
    }

    

    