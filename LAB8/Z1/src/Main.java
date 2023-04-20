import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean success = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of numbers!");

        while(!success){
            try {

                System.out.println("Input type of operation:");
                char sign = scanner.nextLine().charAt(0);
                if(sign!='+' && sign!='-' && sign!='*' && sign!='/'){
                    System.out.println("----------------------------------------");
                    System.out.println("Please input a correct operation sign!!!");
                    System.out.println("----------------------------------------");

                }else{

                    System.out.println("Input first num:");
                    double a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input second num:");
                    double b = Integer.parseInt(scanner.nextLine());


                    getValue(a,b,sign);
                    success = true;
                }

            }catch (NumberFormatException e){
                System.out.println("-------------------------------------------------");
                System.out.println("Please input a number and not a letter or sign!!!");
                System.out.println("-------------------------------------------------");
            }
        }


    }



    public static void getValue(double a, double b, char sign) throws NumberFormatException{
        switch (sign){
            case '+':  System.out.println("Your result is: "+(a+b));
                break;
            case '-':   System.out.println("Your result is: "+(a-b));
                break;
            case '*':   System.out.println("Your result is: "+(a*b));
                break;
            case '/':   System.out.println("Your result is: "+(a/b));
                break;
        }
    }

}
