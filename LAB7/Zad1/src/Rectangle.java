public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    protected double getArea() {
        return sideA*sideB;
    }

    @Override
    protected double getPerimeter() {
        return ((sideA*2)+(sideB*2));
    }
}
