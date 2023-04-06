public class Main {
    public static void main(String[] args) {

        Pojazd tab[] = new Pojazd[5];
        Pojazd pojazd1 = new Samochód();
        tab[0] = pojazd1;
        Pojazd pojazd2 = new Samochód("Srebrny","Bzzzzzt", "100.2 V12");
        tab[1] = pojazd2;
        Pojazd pojazd3 = new Samochód("Biały","Boop Boop", "5.2 V8");
        tab[2] = pojazd3;
        Pojazd pojazd4 = new Rower();
        tab[3] = pojazd4;
        Pojazd pojazd5 = new Rower("żółty","pyk pyk","Na miasto");
        tab[4] = pojazd5;


        for (int i = 0; i < tab.length; i++) {
            tab[i].informację();
            System.out.println("------------");
        }
    }
}