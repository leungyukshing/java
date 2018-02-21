public class Rectangle extends Shape{
  protected double width;
  protected double length;

  Rectangle() {
    width = 1;
    length = 1;
  }

  Rectangle(double _width, double _length) {
    width = _width;
    length = _length;
  }

  Rectangle(double _width, double _length, String _color, boolean _filled) {
    super(_color, _filled);
    width = _width;
    length = _length;
  }

  public double getWidth() { return width; }
  
  public void setWidth(double new_width) {
    width = new_width;
  }

  public double getLength() { return length; }

  public void setLength(double new_length) {
    length = new_length;
  }

  public double getArea() {
    double area = width * length;
    return area;
  }

  public double getPerimeter() {
    double perimeter = 2 * (width + length);
    return perimeter;
  }

  public String toString() {
    String str = "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    return str;
  }
}