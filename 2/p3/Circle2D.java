public class Circle2D {
  private double x;
  private double y;
  private double radius;

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getRadius() {
    return radius;
  }

  Circle2D() {
    x = y = 0;
    radius = 1;
  }

  Circle2D(double _x, double _y, double _radius) {
    x = _x;
    y = _y;
    radius = _radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  public boolean contains(double _x, double _y) {
    double distance = Math.pow((Math.pow((x - _x), 2) + Math.pow((y - _y), 2)), 0.5);
    if (distance < radius)
      return true;
    else 
      return false;
  }

  public boolean contains(Circle2D circle) {
    if (radius <= circle.getRadius())
      return false;
    double distance = Math.pow((Math.pow((x - circle.getX()), 2) + Math.pow((y - circle.getY()), 2)), 0.5);
    if (distance < circle.getRadius())
      return true;
    return false;
  }

  public boolean overlaps(Circle2D circle) {
    double distance = Math.pow((Math.pow((x - circle.getX()), 2) + Math.pow((y - circle.getY()), 2)), 0.5);
    if ((distance > (Math.abs(radius-circle.getRadius())) && (distance < (radius + circle.getRadius())))) {
      return true;
    }
    return false;
  }

}