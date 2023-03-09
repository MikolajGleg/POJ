import java.lang.Math;

public class Punkt { //Zadanie 3
    double x;
    double y;

    Punkt(){
        this.x = 0;
        this.y = 0;
    }

    Punkt(int x,int y){
        this.x = x;
        this.y = y;
    }

    void obliczOdległość(double x, double y){
        System.out.println(Math.sqrt((y - this.y) * (y - this.y) + (x - this.x) * (x - this.x)));
    }

    void obliczOdległość(Punkt punkt){

        System.out.println(Math.sqrt((punkt.y - this.y) * (punkt.y - this.y) + (punkt.x - this.x) * (punkt.x - this.x)));
    }

    public static void main(String[] args) {
        Punkt punkt = new Punkt(5,5);
        punkt.obliczOdległość(2,2);

        Punkt punkt2 = new Punkt(1,1);
        punkt2.obliczOdległość(punkt);
    }
}
