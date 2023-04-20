public class Triangle extends Shape{


    double heightFromSide1;
    double side1;
    double side2;
    double side3;

    Triangle(double heightFromSide1,double side1, double side2,double side3){
        if(side1<side2+side3 && side2<side1+side3 && side3<side1+side2){
            System.out.println("Valid Triangle");
            this.heightFromSide1 = heightFromSide1;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else {
            System.out.println("Invalid Triangle");
            this.heightFromSide1 = -1;
            this.side1 = -1;
            this.side2 = -1;
            this.side3 = -1;
        }
    }

    @Override
    protected double getArea() {
        return 0.5*side1*heightFromSide1;
    }

    @Override
    protected double getPerimeter() {
        return side1+side2+side3;
    }
}
