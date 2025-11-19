public abstract class Shape3D extends  Shape2D{
    private  double depth;

     public Shape3D(double h, double w,double dp) {
        super(h, w);
        this.depth = dp;
    }
    public Shape3D(double dp, double r){
        super(r);
        this.depth= dp;
    }
    //public Shape3D(double h, double r){
      //   super(h,r);
    //}


    public abstract double getVolume();

    @Override
    public String toString() {
        return " Area=" +getArea() +"  Volume="+ getVolume();
    }

    public double getDepth() {
        return depth;
    }
}

