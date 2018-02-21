public abstract class Shape {
  protected String color = "red";
  protected boolean filled = true;

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
  public abstract double getArea();
  public abstract double getPerimeter();
}