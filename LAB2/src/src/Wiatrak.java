public class Wiatrak { //Zadanie 5
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;

    Wiatrak(){
        this.color = "czerwony";
        this.speed = MEDIUM;
        this.on = true;
        this.radius = 5;
    }

    Wiatrak(String color, int speed, double radius, boolean on){
        this.color = color;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }

    void dajInfo(){
        System.out.println("--INFORMACJE O WIATRAKU--");
        System.out.println("Szybkosc: " + this.speed);
        System.out.println("Włączony?: " + this.on);
        System.out.println("Promień: " + this.radius);
        System.out.println("Kolor: " + this.color);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Wiatrak wiatrak = new Wiatrak();
        Wiatrak wiatrak2 = new Wiatrak("czerwony", 10, 5, true);

        wiatrak2.dajInfo();
    }
}
