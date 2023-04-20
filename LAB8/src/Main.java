import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char plus = scanner.nextLine().charAt(0);
        if(plus == '+'){
            System.out.println("good");
        }else {
            System.out.println("bad");
        }
    }
}