public class Sphere extends Shape3D{
    public Sphere(double dp, double r) {
        super(dp, r);
    }


//    public Sphere(double h, double r) {
//        super(h, r);
//    }

    @Override
    public double getVolume() {
        return (4.0/3.0)*getPI()*getRadius()*getRadius()*getRadius();
    }

    @Override
    public double getArea() {
        //double red = getRadius();
        return (4)*getPI()*getRadius() *getRadius();
    }

    @Override
    public String toString() {
        return "Sphere" +super.toString();
    }
}
