public abstract class Figura3D extends Figura2D{
    Figura3D(int[] krawedzie) {
        super(krawedzie);
    }

    @Override
    abstract double obliczPole();

    @Override
    abstract int sumaKrawedzi();

    double objetoscFigury(){
        return 0;
    }
}
