public class Kwadrat extends Figura2D{
    Kwadrat(int bok){
        super(new int[]{bok,bok,bok,bok});
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
