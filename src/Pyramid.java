public class Pyramid extends  Shape3D{
    public Pyramid(double h, double w, double dp) {
        super(h, w, dp);
    }
//    private double slantHeight(){
//        double Height = getHeight();
//        double baseSide = getDepth();
//        return Math.sqrt(Math.pow(Height,2)+Math.pow(baseSide/2,2));
//    }
    @Override
    public double getVolume() {
//        double baseSide = getDepth();
//        double baseArea = baseSide*baseSide;
        return (1.0/3.0)*(getHeight()*getDepth()*getWidth());
    }

    @Override
    public double getArea() {
//        double baseSide = getWidth();
//
//        double baseArea = baseSide*baseSide;
//        double sHeight = slantHeight();
//
//        double lateralArea  = 2*baseSide*sHeight;
        return getHeight()*getWidth();
    }

    @Override
    public String toString() {
        return "Pyramid" +super.toString();
    }
}
