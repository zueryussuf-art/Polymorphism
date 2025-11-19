public class Square extends Shape2D{


    public Square(double h, double w) {
        super(h, w);
    }

    @Override
    public double getArea() {
        return getWidth()*getHeight();
    }

    @Override
    public String toString() {
        return "Square" +super.toString();
    }
}
