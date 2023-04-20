public class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    protected double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    protected double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
