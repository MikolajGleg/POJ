public class Osoba {
    private String imie;
    private String nazwisko;
    private Integer rokUrodzenia;

    Osoba(String imie, String nazwisko, Integer rokUrodzenia) throws Exception {
        if(imie.isEmpty() || nazwisko.isEmpty()){
            throw new Exception("Pola imie i nazwisko nie mogą być puste!");
        }else {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.rokUrodzenia = rokUrodzenia;
        }

    }

    void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia) {
        
    }
}
