public class Cone extends Shape3D{
    public Cone(double h, double r) {
        super(h, r);
    }

    @Override
    public double getVolume() {
//        double rad = getRadius();
//        double hei=getHeight();
//        double pi = getPI();
        return (1.0/3.0)*(getPI()*getDepth()*getRadius()*getRadius());
    }

    @Override
    public double getArea() {
//        double radi = getRadius();
//        double heig =getHeight();
//        double pi = getPI();
        double slant = Math.sqrt(getRadius()*getRadius() + getDepth()*getDepth());
        return getPI()*getRadius()*(getRadius()+ slant);
    }

    @Override
    public String toString() {
        return "Cone" +super.toString();
    }
}
