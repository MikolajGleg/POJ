public class Square extends Shape{
    private double side;

    Square(double side){
        this.side = side;
    }
    @Override
    protected double getArea() {
        return side*side;
    }

    @Override
    protected double getPerimeter() {
        return (side*4);
    }
}
