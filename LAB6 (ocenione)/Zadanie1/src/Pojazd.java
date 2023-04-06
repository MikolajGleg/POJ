public class Pojazd {
    private int liczbaKół;
    private String kolor;
    private String sygnał;

    Pojazd(){
    }

    Pojazd(int liczbaKół,String kolor, String sygnał){
        this.liczbaKół = liczbaKół;
        this.kolor = kolor;
        this.sygnał = sygnał;
    }

    public void informację(){
        System.out.println("Mój obiekt ma liczbe kół: " + this.liczbaKół);
        System.out.println("Mój obiekt ma kolor: " + this.kolor);
        System.out.println("Mój obiekt ma sygnał: " + this.sygnał);
    }
}
