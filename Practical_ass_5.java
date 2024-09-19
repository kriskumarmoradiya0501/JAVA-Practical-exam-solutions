
abstract class Shape5{
    double dim1;
    double dim2;
    public Shape5(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    public abstract double Area();
}
class Rectangle5 extends Shape5 {
    public Rectangle5(double length, double width) {
        super(length, width);
    }

    public double Area() {
        return dim1 * dim2; // length * width
    }
}
class Circle5 extends Shape5 {
    public Circle5(double radius) {
        super(radius,0);
    }

    public double Area() {
        return dim1 * dim1 * Math.PI; // length * width
    }
}
class Triangle5 extends Shape5 {
    public Triangle5(double base, double height) {
        super(base, height);
    }

    public double Area() {
        return (0.5*dim1 * dim2); // length * width
    }
}

public class Practical_ass_5 {
    public static void main(String[] args) {
        Rectangle5 r = new Rectangle5(10,20);
        System.out.println("Area of Ractangle is "+r.Area());
        Circle5 c = new Circle5(10);
        System.out.println("Area of Circul is "+c.Area());
        Triangle5 t = new Triangle5(10,15);
        System.out.println("Area of Triangle is "+t.Area());
    }
}
