public class Circle extends Shape2D{

    Circle(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        return getPI()*getRadius() *getRadius() ;
    }

    @Override
    public String toString() {
        return "Circle" +super.toString();
    }
}