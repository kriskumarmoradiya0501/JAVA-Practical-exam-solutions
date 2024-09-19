import java.awt.*;

class Ractangle1{
    double width;
    double length;
    public Ractangle1(double width,double length){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return (width*length);
    }
}

class Cuboid extends Ractangle1{
    double height;
    public Cuboid(double width,double length,double height){
        super(width,length);
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
}

public class Week_10_2 {
    public static void main(String[] args) {
        Ractangle1 r = new Ractangle1(5,10);
        System.out.println("Rectangle Area = "+r.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }
}
