public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    Circle c2 = new Circle(5);
    Circle c3 = new Circle(3, "red", true);

    System.out.println("c1: " + c1);
    System.out.println("c2: " + c2);
    System.out.println("c3: " + c3);
  }
}