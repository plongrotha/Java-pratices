
public class Rectangle extends Shape{
      private double width,lenght;
      
      public Rectangle() {
    	  super();
    	  this.width = 1.0d;
    	  this.lenght= 1.0d;
      }
      public Rectangle(double width,double lenght) {
    	  super();
    	  this.width = width;
    	  this.lenght = lenght;
      }
      public Rectangle(double width,double lenght,String color) {
    	  super(color);
    	  this.width = width;
    	  this.lenght = lenght;
      }
      public double getWidth() {
    	  return this.width;
      }
      public void setWidth(double width) {
    	  this.width = width;
      }
      public double getLenght() {
    	  return this.lenght;
      }
      public void setLenght(double lenght) {
    	  this.lenght = lenght;
      }
      @Override
      public double getArea() {
    	  return this.width * this.lenght;
      }
      @Override
      public double getparimeter() {
    	  return 2*(this.width+this.lenght);
      }
      @Override
      public String toString() {
    	  return "Rectangle : Width ="+this.width+", Lenght ="+this.lenght+",Area ="+getArea()+",Parimeter ="+getparimeter()+"color"+super.getColor();
      }
      
}
