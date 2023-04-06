public class Równoboczny extends Trójkąt{
    Równoboczny(){
        super();
    }
    Równoboczny(int a){
        this.a = a;
        this.h = 0;
    }

    @Override
    public void obliczPole() {
        System.out.println("Pole trójkąta równobocznego to: " + ((a*a)*Math.sqrt(3)) / 4.0);
    }
}
