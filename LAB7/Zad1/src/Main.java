public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,4);
        Shape square = new Square(5);
        Shape circle = new Circle(6);
        Shape triangle = new Triangle(4,7,10,5);

        Shape[] shapes = {rectangle,square,circle,triangle};

        for (Shape sh: shapes) {
            System.out.println("Area is:" + sh.getArea());
            System.out.println("Perimeter is:" + sh.getPerimeter());
        }
    }
}