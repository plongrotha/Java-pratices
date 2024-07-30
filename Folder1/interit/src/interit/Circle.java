package interit;
import java.util.Scanner;
public class Circle extends Point{
    double r ;
    
    Circle(){
    	super();
    	r=0;
    }
     Circle(int x,int y,double d){
    	 super(x,y);
        this.r = d;
    }
    public void input() {
    	super.input();
       Scanner scan = new Scanner(System.in);
    	   System.out.print("Enter r   ="); r = scan.nextFloat();
   
    }
    public void output() {
    	super.output();
     System.out.println("size of R   ="+r); 	
    }
    public float getArea() {
    	return (float) (3.14*r*r);
    }
}
