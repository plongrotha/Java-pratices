package interit;
import java.util.Scanner;
public class Point {
      
	int x;
	int y;
	Point(){
		x=0;
		y=0;
	}
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void input() {
		   Scanner scan = new Scanner(System.in);
			System.out.print("Enter x ="); x = scan.nextInt();
			System.out.print("Enter y ="); y = scan.nextInt();
	}
	public void output() {
		System.out.println("size of X ="+x);
		System.out.println("size of Y ="+y);
	}
}

