public class Samochód extends Pojazd{
    private String rodzajSilnika;

    Samochód(){
        super(4,"czerwony","Beep Beep");
        this.rodzajSilnika = "2.4 V4";
    }

    Samochód(String kolor, String sygnał, String rodzajSilnika){
        super(4,kolor,sygnał);
        this.rodzajSilnika = rodzajSilnika;
    }

    @Override
    public void informację(){
        super.informację();
        System.out.println("Mój obiekt ma silnik: " + this.rodzajSilnika);
    }
}
