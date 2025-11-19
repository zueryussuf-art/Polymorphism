public class Cylinder extends Shape3D{
    public Cylinder(double dp, double r) {
        super(dp, r);
    }
//    public Cylinder(double h, double r) {
//        super(h, r);
//    }

    @Override
    public double getVolume() {
        return getPI()*getRadius()*getRadius()*getDepth();
    }

    @Override
    public double getArea() {
        return  2*getPI()*getRadius()*(getRadius() + getDepth());
    }

    @Override
    public String toString() {
        return "Cylinder" +super.toString();
    }
}
