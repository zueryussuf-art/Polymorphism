public abstract class Shape2D {
    private final double PI = Math.PI;
    private double height;
    private double radius;
    private double width;


    public Shape2D(double h, double w){
        this.height = h;
        this.width = w;

    }
    public Shape2D(double r){
        this.radius  = r;
    }

    public abstract double getArea();

    public double getRadius() {
        return radius;
    }

    public double getWidth() {
         return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return " Area=" +getArea() ;
    }
}
