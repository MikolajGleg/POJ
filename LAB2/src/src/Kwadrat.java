public class Kwadrat { //Zadanie 2
    int bok;

    public Kwadrat(int mojBok){
        this.bok = mojBok;
    }

    public boolean czyMojBokJestWiekszy(int innyBok){
        return this.bok > innyBok;
    }

    public int obliczObwod(){
        return this.bok*4;
    }

    public int obliczPole(){
        return this.bok*this.bok;
    }

    public static void main(String args[]){
        Kwadrat mojKwadrat = new Kwadrat(10);
        System.out.println(mojKwadrat.czyMojBokJestWiekszy(20));
        System.out.println(mojKwadrat.obliczObwod());
        System.out.println(mojKwadrat.obliczPole());
    }
}
