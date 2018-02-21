public class Fan {
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;
  
  private int speed;
  private boolean on;
  private double radius;
  private String color;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int new_speed) {
    speed = new_speed;
  }

  public boolean getOn() {
    return on;
  }

  public void setOn(boolean new_on) {
    on = new_on;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double new_radius) {
    radius = new_radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String new_color) {
    color = new_color;
  }

  Fan() {
    speed = SLOW;
    on = false;
    radius = 5;
    color = "blue";
  }

  public String toString() {
    String description;
    if (on) {
      description = "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
    }
    else {
      description = "Fan is off";
    }
    return description;
  }
}