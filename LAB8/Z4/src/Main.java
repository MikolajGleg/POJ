import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        while (!success){
            try {

                System.out.println("Podaj imie");
                String imie = scanner.nextLine();
                System.out.println("Podaj nawzisko");
                String nazwisko = scanner.nextLine();
                System.out.println("Podaj rok urodzenia");
                Integer rokUrodzenia = Integer.parseInt(scanner.nextLine());


                Osoba osoba = new Osoba(imie,nazwisko,rokUrodzenia);
                System.out.println("Poprawne wykonanie");
                success = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}