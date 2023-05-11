public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println("Pole kwadrata to:" + kwadrat.obliczPole());
        System.out.println("Suma Krawędzi kwadrata to:" +kwadrat.sumaKrawedzi()+'\n');

        Prostokat prostokat = new Prostokat(5,10);
        System.out.println("Pole prostokąta to:" + prostokat.obliczPole());
        System.out.println("Suma Krawędzi prostokąta to:" + prostokat.sumaKrawedzi()+'\n');

        Prostopadloscian prostopadloscian = new Prostopadloscian(1,3,4);
        System.out.println("Pole prostopadłościana to:" + prostopadloscian.obliczPole());
        System.out.println("Objętość prostopadłościana to:" + prostopadloscian.obliczPole());
        System.out.println("Suma Krawędzi prostopadłościana to:" + prostopadloscian.sumaKrawedzi()+'\n');

        Szescian szescian = new Szescian(4);
        System.out.println("Pole sześciana to:" + szescian.obliczPole());
        System.out.println("Objętość sześciana to:" + szescian.obliczPole());
        System.out.println("Suma Krawędzi sześciana to:" + szescian.sumaKrawedzi());
    }
}