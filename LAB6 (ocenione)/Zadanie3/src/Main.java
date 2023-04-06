public class Main {
    public static void main(String[] args) {
        Trójkąt trójkąt = new Trójkąt();
        trójkąt.obliczPole();
        Trójkąt trójkąt1 = new Trójkąt(5);
        trójkąt1.obliczPole();

        Równoboczny równoboczny = new Równoboczny();
        równoboczny.obliczPole();
        Równoboczny równoboczny1 = new Równoboczny(4);
        równoboczny1.obliczPole();
    }
}