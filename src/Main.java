//
//import java.util.Scanner;
//
////2015
// class ogrenci1 extends Ogrenci{
//
//    //int marks = ;
//    public ogrenci1(){
//        super();
//        //this.marks =marks;
//    }
//    public double ortalama(){
//        double marks = super.ortalama();
//        if(marks >= 60){
//            System.out.println("2015 ogrenci gecti");
//        }
//        else{
//            System.out.println("2015 student failed");
//        }
//        return marks;
//    }
//
//
//
//}
////2020
// class ogrenci2 extends Ogrenci{
//    //int marks;
//    public ogrenci2(){
//        super();
//    }
//    @Override
//    public double ortalama(){
//        double marks =  super.ortalama();
//        if(marks >= 50){
//            System.out.println("2020 ogrenci gecti");
//        }
//        else{
//            System.out.println("2020 student Failed");
//        }
//        return marks;
//    }
//
//}
////2025
// class ogrenci3 extends Ogrenci{
//    //int marks;
//    public ogrenci3(){
//        super();
//    }
//    @Override
//    public double ortalama(){
//        double marks = super.ortalama();
//        if(marks >= 35){
//            System.out.println("2025 ogrenci gecti");
//        }
//        else {
//            System.out.println("2025 student failed");
//        }
//        return marks;
//    }
//
//
//}
//
//

  class TestMain {
    public static void main(String [] args){
        Square shape1 = new Square(2.90,3.6);
        Circle shape2 = new Circle(2.5);
        Rectangle shape3 = new Rectangle(2.5 ,4.7);

        Shape2D[] shapes = {shape1,shape2,shape3};

        System.out.println("---------SHAPE 2D AREA'S-----------");
        for(Shape2D shp : shapes){
            System.out.println(shp.toString());// to print Area's only write  System.out.println(shp.getArea());
        }

        Cylinder cylinder = new Cylinder(3.4,2.1);
        Sphere sphere = new Sphere(4.5,3.0);
        Pyramid pyramid = new Pyramid(4.0,7.8,12.3);
        Cone cone = new Cone(5.5,3.9);

        Shape3D[] shapes2 = {cylinder,sphere,pyramid,cone};

        System.out.println("-----SHAPE 3D AREA'S AND VOLUME'S---");
        for(Shape3D shape3D : shapes2){
//            System.out.println("-----SHAPE 3D AREA'S AND VOLUME'S---");
            System.out.println(shape3D.toString());
          //  System.out.println(shape3D.getArea());// for 3D Area 

          //  System.out.println("---SHAPE 3D VOLUMES----");
            //System.out.println(shape3D.getVolume());// For 3D volumes
        }
        //        ogrenci1 ogr1 = new ogrenci1();
//        ogrenci2 ogr2 = new ogrenci2();
//        ogrenci3 ogr3  = new ogrenci3() ;
//
//        Ogrenci [] ogren = {ogr1 , ogr2 , ogr3 };
//        for(Ogrenci ogr : ogren){
//            System.out.println(ogr.ortalama());
//        }
    }
}
