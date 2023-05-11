import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean success = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator!");

        while(!success){
            try {

                System.out.println("Wprowadz operacje (1-4):");
                System.out.println("1: Dodaj");
                System.out.println("2: Odejmij");
                System.out.println("3: Pomnóż");
                System.out.println("4: Podziel");
                char sign = scanner.nextLine().charAt(0);
                if(sign!='1' && sign!='2' && sign!='3' && sign!='4'){
                    System.out.println("------------------------------------------");
                    System.out.println("Wprowadz liczbe od 1 do 4 dla operacji!!!!");
                    System.out.println("------------------------------------------");

                }else{

                    System.out.println("Podaj pierwszy numer:");
                    double a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj drugi numer:");
                    double b = Integer.parseInt(scanner.nextLine());

                    getValue(a,b,sign);
                    success = true;
                }

            }catch (NumberFormatException e){
                System.out.println("-------------------------------------------------");
                System.out.println("Proszę wprowadzić numer a nie literkę lub znak!!!");
                System.out.println("-------------------------------------------------");
            }
        }


    }

    public static void getValue(double a, double b, char sign) throws NumberFormatException{
        switch (sign){
            case '1':  System.out.println("Wynik dodawania na liczbach "+a+" oraz "+b+" wynosi "+ (a+b));
                break;
            case '2':   System.out.println("Wynik odejmowania na liczbach "+a+" oraz "+b+" wynosi "+ (a-b));
                break;
            case '3':   System.out.println("Wynik mnożenia na liczbach "+a+" oraz "+b+" wynosi "+ (a*b));
                break;
            case '4':   System.out.println("Wynik dzielenia na liczbach "+a+" oraz "+b+" wynosi "+ (a/b));
                break;
        }
    }

}
