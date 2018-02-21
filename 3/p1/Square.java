public class Square extends Rectangle {
  public Square() {}
  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String _color, boolean _filled) {
    super(side, side, _color, _filled);
  }

  public double getSide() { return width; }
  
  public void setSide(double new_side) {
    width = length = new_side;
  }

  public String toString() {
    String str = "A Square with side = " + super.width + ", which is a subclass of " + super.toString();
    return str;
  }

  public void setLength(double new_side) {
    width = length = new_side;
  }

  public void setWidth(double new_side) {
    width = length = new_side;
  }
}