public class TestDemo {
  public static void main(String[] args) {
    Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
    System.out.println(s1);
    System.out.println("s1 area: " + s1.getArea());
    System.out.println("s1 perimeter: " + s1.getPerimeter());
    System.out.println("s1 color: " + s1.getColor());
    System.out.println("s1 filled: " + s1.isFilled());
    /*s1没有getRadius()的方法！*/
    //System.out.println("s1 radius: " + s1.getRadius());
    System.out.println();

    Circle c1 = (Circle)s1; // Downcast back to Circle
    System.out.println(c1);
    System.out.println("c1 area: " + c1.getArea());
    System.out.println("c1 perimeter: " + c1.getPerimeter());
    System.out.println("c1 color: " + c1.getColor());
    System.out.println("c1 filled: " + c1.isFilled());
    System.out.println("c1 radius: " + c1.getRadius());
    System.out.println();

    /*抽象类无法实例化*/
    //Shape s2 = new Shape();

    Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
    System.out.println(s3);
    System.out.println("s3 area: " + s3.getArea());
    System.out.println("s3 perimeter: " + s3.getPerimeter());
    System.out.println("s3 color: " + s3.getColor());
    
    //System.out.println("s3 length" + s3.getLength());
    System.out.println();

    Rectangle r1 = (Rectangle)s3; // downcast
    System.out.println(r1);
    System.out.println("r1 area: " + r1.getArea());
    System.out.println("r1 color: " + r1.getColor());
    System.out.println("r1 length: " + r1.getLength());
    System.out.println();

    Shape s4 = new Square(6.6); // Upcast
    System.out.println(s4);
    System.out.println("s4 area: " + s4.getArea());
    System.out.println("s4 color: " + s4.getColor());
    //System.out.println("s4 side: " + s4.getSide());
    System.out.println();


    System.out.println("Downcast Shape s4 to Rectangle");
    Rectangle r2 = (Rectangle)s4;
    System.out.println(r2);
    System.out.println("r2 area: " + r2.getArea());
    System.out.println("r2 color: " + r2.getColor());  
    //System.out.println("r2 side: " + r2.getSide());
    System.out.println("r2 length: " + r2.getLength());
    System.out.println();

    System.out.println("Downcast Rectangle r2 to Square");
    Square sq1 = (Square)r2;
    System.out.println(sq1);
    System.out.println("sq1 area: " + sq1.getArea());
    System.out.println("sq1 color: " + sq1.getColor());
    System.out.println("sq1 side: " + sq1.getSide());
    System.out.println("sq1 length: " + sq1.getLength());
    System.out.println();
  }
}