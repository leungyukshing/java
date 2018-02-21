public class Circle extends Shape {
  private double radius;

  Circle() {
    radius = 1.0;
  }
  Circle(double _radius) {
    radius = _radius;
  }
  Circle(double _radius, String _color, boolean _filled) {
    super(_color, _filled);
    radius = _radius;
  }

  public double getRadius() { return radius; }

  public void setRadius(double new_radius) {
    radius = new_radius;
  }

  public double getArea() {
    double area = Math.PI * Math.pow(radius, 2);
    return area;
  }

  public double getPerimeter() {
    double perimeter = 2 * Math.PI * radius;
    return perimeter;
  }

  public String toString() {
    String str = "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    return str;
  }
}