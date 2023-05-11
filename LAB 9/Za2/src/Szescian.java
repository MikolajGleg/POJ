public class Szescian extends Figura3D{
        Szescian(int bok) {
            super(new int[]{bok});
        }

        @Override
        double obliczPole() {
            return 6*(this.krawedzie[0]*this.krawedzie[0]);
        }

        @Override
        int sumaKrawedzi() {
            return 12*this.krawedzie[0];
        }

        double objetoscFigury(){
            return this.krawedzie[0]*this.krawedzie[0]*this.krawedzie[0];
        }


    }


