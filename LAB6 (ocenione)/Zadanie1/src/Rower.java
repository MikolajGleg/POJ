public class Rower extends Pojazd{
    private String rodzajRoweru;

    Rower(){
        super(2,"niebieski","dzyń dzyń");
        this.rodzajRoweru = "Górski";
    }

    Rower(String kolor, String sygnał, String rodzajRoweru){
        super(2,kolor,sygnał);
        this.rodzajRoweru = rodzajRoweru;
    }

    @Override
    public void informację(){
        super.informację();
        System.out.println("Mój ma rodzaj roweru: " + this.rodzajRoweru);
    }
}
