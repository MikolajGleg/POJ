public class Prostokat extends Figura2D{
    Prostokat(int bokA, int bokB) {
        super(new int[]{bokA,bokB,bokA,bokB});
    }

    @Override
    double obliczPole() {
        return this.krawedzie[0]*this.krawedzie[1];
    }

    @Override
    int sumaKrawedzi() {
        return this.krawedzie[0]+this.krawedzie[1]+this.krawedzie[2]+this.krawedzie[3];
    }
}
