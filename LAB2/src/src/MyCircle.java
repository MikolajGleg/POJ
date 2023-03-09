public class MyCircle { //Zadanie 4
    double radius;

    MyCircle(double radius){
        this.radius = radius;
    }

    void obliczObwód(){
        System.out.println("Obwód to: " + 2*Math.PI*this.radius);
    }

    void obliczPole(){
        System.out.println("Pole to: " + Math.PI*(this.radius*this.radius));
    }

    double obliczŚrednice(){
        return this.radius+this.radius;
    }

    public static void main(String[] args) {
        MyCircle mycircle = new MyCircle(3);
        mycircle.obliczObwód();
        mycircle.obliczPole();
        System.out.println("Średnica to: " + mycircle.obliczŚrednice());
    }
}
