public class Shape {
  protected String color = "red";
  protected boolean filled = true;

  Shape() {
    color = "green";
    filled = true;
  }

  Shape(String _color, boolean _filled) {
    color = _color;
    filled = _filled;
  }

  public String getColor() { return color; }

  public void setColor(String new_color) {
    color = new_color;
  }

  public boolean isFilled() { return filled; }

  public void setFilled(boolean new_filled) {
    filled = new_filled;
  }

  public String toString() {
    String str = "A shape with color of " + color + " and ";;
    if (filled) {
      str += "filled.";
    }
    else {
      str += "NOT filled";
    }
    return str;
  }
}