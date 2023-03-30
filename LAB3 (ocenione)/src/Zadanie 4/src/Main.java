import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an id: ");
        input = Integer.parseInt(scanner.nextLine());

        Konto konto = new Konto(100,10);
        Konto konto1 = new Konto(100,20);
        Konto konto2 = new Konto(100,30);
        Konto konto3 = new Konto(100,40);
        Konto konto4 = new Konto(100,50);
        Konto[] tab = new Konto[5];

        tab[0] = konto;
        tab[1] = konto1;
        tab[2] = konto2;
        tab[3] = konto3;
        tab[4] = konto4;

        Konto chosenAccount = new Konto();
        for(int i=0;i<tab.length;i++){
            if(input == tab[i].id){
                chosenAccount = tab[i];
            }
        }

        while(input != 4){
            System.out.println("Main menu");
            System.out.println("1:check balance");
            System.out.println("2:withdraw");
            System.out.println("3:deposit");
            System.out.println("4:exit");
            System.out.println("Enter a choice: ");
            input = Integer.parseInt(scanner.nextLine());

            if(input == 1){
                chosenAccount.checkBalance();

            } else if (input == 2) {
                System.out.println("Enter withdrawal amount: ");
                input = Integer.parseInt(scanner.nextLine());
                chosenAccount.takeOutBalance(input);

            } else if (input == 3) {
                System.out.println("Enter deposit amount: ");
                input = Integer.parseInt(scanner.nextLine());
                chosenAccount.addBalance(input);
            }
        }

    }
}