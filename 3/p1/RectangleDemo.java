public class RectangleDemo {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(2, 4);
    Rectangle r3 = new Rectangle(5, 10, "grey", false);

    System.out.println("r1: " + r1);
    System.out.println("r2: " + r2);
    System.out.println("r3: " + r3);
  }
}