
public class Circle extends Shape{
     private double radius;
     public Circle() {
    	 super();
     }
     public Circle(double radius) {
    	 super();
    	 this.radius = 1;
     }
     public Circle(double radius,String color) {
    	 super(color);
    	 this.radius = radius;
     }
     public double getRadius() {
    	 return this.radius;
     }
     public void setRadiud(double radius) {
    	 this.radius = radius;
     }
     @Override
     public double getArea() {
    	 return Math.PI*Math.pow(radius, 2);
     }
     @Override
     public double getparimeter() {
    	 return Math.PI*(this.radius*2);
     }
     @Override
     public String toString() {
    	 return "Circle : raduis ="+this.radius+",Area ="+getArea()+"Perimeter ="+getparimeter()+", color ="+super.getColor();
     }
     
}
