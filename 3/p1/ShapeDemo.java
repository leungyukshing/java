public class ShapeDemo {
  public static void main(String[] args) {
    Shape shape1 = new Shape();
    Shape shape2 = new Shape("black", true);
    System.out.println("shape1: " + shape1);
    System.out.println("shape2: " + shape2);
    shape2.setFilled(false);
    System.out.println("shape2: " + shape2);
  }
}