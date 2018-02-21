public class MovableCircle implements Movable {
  private MovablePoint center;
  private int radius;

  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    // Call the MovablePoint's constructor to allocate the center instance.
    center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }

  // Implement abstract methods declared in the interface Movable
  public void moveUp() {
    center.y -= center.ySpeed;
  }
  public void moveDown() {
    center.y += center.ySpeed;
  }
  public void moveLeft() {
    center.x -= center.xSpeed;
  }
  public void moveRight() {
    center.x += center.xSpeed;
  }

  public String toString() {
    String str = "x: " + String.valueOf(center.x) + ", y: " + String.valueOf(center.y) + ", radius: " + String.valueOf(this.radius); 
    return str;
  }
}