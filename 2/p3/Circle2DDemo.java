public class Circle2DDemo {
  public static void main(String[] args) {
    Circle2D c1 = new Circle2D(0, 0, 1);
    System.out.println("c1 area is: " + c1.getArea() + ", c1 perimeter is: " + c1.getPerimeter());
    System.out.println("c1.contains(3,3) " + c1.contains(3,3));
    System.out.println("c1.contains(new Circle2D(0, 0, 1)) " + c1.contains(new Circle2D(0, 0, 1)));
    System.out.println("c1.overlaps(new Circle2D(1, 0, 1)) " + c1.overlaps(new Circle2D(1, 0, 1)));
  }
}