import java.time.LocalTime;

public class NowaKlasa {
    String color;
    LocalTime time;
    String place;
    int age;
    boolean isCool;

    NowaKlasa(String color, LocalTime time, String place, int age, boolean isCool){
       this.color = color;
        this.time = time;
        this.place = place;
        this.age = age;
        this.isCool = isCool;
    }

    @Override
    public String toString(){

        return this.color + '\n' + this.time + '\n' + this.place + '\n' + this.age + '\n' + this.isCool;
    }
}
