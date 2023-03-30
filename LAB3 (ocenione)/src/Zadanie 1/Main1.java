import java.util.Scanner;

public class Main1 {
    public static void main(String[]args){
        System.out.println(compare(1,2));
        System.out.println(compare(2,2));
        System.out.println(compare(3,2));

    }

    public static int compare(int a, int b){
        if(b>a){
            return 1;
        } else if (a == b) {
            return 0;
        }else{
            return -1;
        }
    }
}
