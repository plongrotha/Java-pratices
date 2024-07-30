
public class Sqaure extends Rectangle{
     public Sqaure() {
    	 super();
     }
     public Sqaure(double side) {
    	 super(side,side);
     }
     public Sqaure(double side,String color) {
    	 super(side,side,color);
     }
     public double getSide() {
    	 return super.getLenght();
     }
     public void setSide(double side) {
    	 super.setWidth(side);
    	 super.setLenght(side);
     }
     @Override
     public void setWidth(double side) {
     }
     @Override
     public void setLenght(double side) {
    	 super.setWidth(getSide());
    	 super.setLenght(getSide());
     }
     @Override
     public String toString() {
    	 return "Sqaure : Side ="+getSide()+", Area ="+super.getArea()+"Parimeter ="+super.getparimeter()+"color"+super.getColor();
     }
}
