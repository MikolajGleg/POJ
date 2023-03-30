import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        NowaKlasa nowaKlasa = new NowaKlasa("Forest Green",myObj,"Mines of Moria",555,true);
        System.out.println(nowaKlasa.toString());
    }
}