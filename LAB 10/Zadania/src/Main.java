import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ZAD1
        try (Scanner scanner = new Scanner(new File("LAB 10\\Input"))){
            int i = 0;
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                if(i%2==0){
                    System.out.println(line);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        //ZAD2
        File basedir = new File("LAB 10\\basedir");
        List<File> subdirectories = Arrays.asList(basedir.listFiles());
        int biggest = 0;
        String name = "";

        for(File subdirectory: subdirectories){
            try {
                List<File> files = Arrays.asList(subdirectory.listFiles());
                System.out.println(files.size() + " files in folder " + subdirectory.getName());
                if(files.size() > biggest){
                    biggest = files.size();
                    name = subdirectory.getName();
                }
            }catch (NullPointerException e){
                System.out.println("First folder is null");
            }

        }
        System.out.println(name + " folder has the most files: " + biggest);

        //ZAD3
        LocalDate date = LocalDate.now();
        int i = 0;
        while (i != 100) {
            date = date.plusYears(1);
            if(date.isLeapYear()){
                System.out.println(date);
                i++;
            }
        }
        //ZAD4
        System.out.println("Input date format");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(input);
        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(formatter);
        System.out.println("Current date is : " + formattedDate);

        //ZAD5

    }
}