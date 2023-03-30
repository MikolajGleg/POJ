public class Logika {
    private int liczbaKomputera;
    private int proby;
    private boolean poprawnaOdpowiedz;

    public Logika(int zakresMin, int zakresMax){
        this.proby = 5;
        this.liczbaKomputera = (int) (Math.random()*zakresMax) + zakresMin;
        this.poprawnaOdpowiedz = false;
    }

    public int getLiczba(){
        return this.liczbaKomputera;
    }

    public boolean getPoprawnaOdpowiedz(){
        return this.poprawnaOdpowiedz;
    }

    public boolean guess(int guess){
        if(guess > liczbaKomputera){
            System.out.println("Liczba za duża!");
            this.proby--;
        } else if (guess < liczbaKomputera) {
            System.out.println("Liczba za mała!");
            this.proby--;
        }else {
            System.out.println("Gratulacje poprawna liczba to była " + guess);
            this.poprawnaOdpowiedz = true;
            return this.poprawnaOdpowiedz;
        }

        if(proby==0){
            System.out.println("Koniec gry");
            System.out.println("Poprawna liczba to była " + this.liczbaKomputera);
            this.poprawnaOdpowiedz = true;
            return this.poprawnaOdpowiedz;
        }
        return this.poprawnaOdpowiedz;
    }
}
