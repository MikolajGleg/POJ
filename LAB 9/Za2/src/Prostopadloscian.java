public class Prostopadloscian extends Figura3D{
    Prostopadloscian(int bokA,int bokB,int bokC) {
        super(new int[]{bokA,bokB,bokC});
    }

    @Override
    double obliczPole() {
        return (2*(this.krawedzie[0]*this.krawedzie[1]))+(2*(this.krawedzie[1]*this.krawedzie[2]))+(2*(this.krawedzie[0]*this.krawedzie[2]));
    }

    @Override
    int sumaKrawedzi() {
        return (4*this.krawedzie[0])+(4*this.krawedzie[1])+(4*this.krawedzie[2]);
    }

    double objetoscFigury(){
        return this.krawedzie[0]*this.krawedzie[1]*this.krawedzie[2];
    }


}
