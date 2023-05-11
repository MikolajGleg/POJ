public abstract class Figura {
    int krawedzie[];

    Figura(int[] krawedzie){
        this.krawedzie = krawedzie;
    }
    abstract double obliczPole();
    abstract int sumaKrawedzi();

}
