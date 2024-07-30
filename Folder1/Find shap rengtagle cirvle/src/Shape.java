import java.math.*;
abstract class Shape {
      private String color;
      public Shape() {
    	  this.color = "Blue";
      }
      public Shape(String color) {
    	  this.color = color;
      }
      public String getColor() {
    	  return this.color;
      }
      public void setColor(String color) {
    	  this.color = color;
      }
      abstract public double getArea();
      abstract public double getparimeter();
      abstract public String toString();
}
