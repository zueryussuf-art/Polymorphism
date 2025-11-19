public class Rectangle extends Shape2D{
    public Rectangle(double h, double w) {
        super(h, w);
    }

    @Override
    public double getArea() {
        return getHeight() *getWidth() ;
    }

    @Override
    public String toString() {
        return "Reactangle" +super.toString();
    }
}
