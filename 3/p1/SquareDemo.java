public class SquareDemo {
  public static void main(String[] args) {
    Square s1 = new Square();
    Square s2 = new Square(7);
    Square s3 = new Square(5, "white", true);

    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("s3: " + s3);

    s2.setWidth(8);
    System.out.println("s2: " + s2);
    s2.setLength(10);
    System.out.println("s2: " + s2);
    System.out.println("s2 Area: " + s2.getArea());
  }
}