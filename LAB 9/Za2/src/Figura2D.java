public abstract class Figura2D extends Figura{
    Figura2D(int[] krawedzie) {
        super(krawedzie);
    }

    @Override
    abstract double obliczPole();

    @Override
    abstract int sumaKrawedzi();
}
