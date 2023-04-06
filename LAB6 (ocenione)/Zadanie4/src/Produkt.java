public class Produkt {
    private String nazwa;
    private int cena;
    private int ilość;

    Produkt(String nazwa, int cena, int ilość){
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilość = ilość;
    }

    @Override
    public String toString(){
        String fullTable;
        System.out.println("Nazwa Produktu: "+ this.nazwa);
        System.out.println("Cena Produktu: "+ this.cena);
        System.out.println("Ilość Produktu: "+ this.ilość);
        return "";
    }
}
