public class Trójkąt {
    protected double a;
    protected double h;

    Trójkąt(){
        this.a = 1.0;
        this.h = 2.0;
    }

    Trójkąt(int h){
        this();
        this.h = h;
    }

    public void obliczPole(){
        System.out.println("Pole trójkąta to: " + (a*h) / 2.0);
    }


}
