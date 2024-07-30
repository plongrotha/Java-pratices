import java.util.Scanner;

public class Lecturer extends Person{

	int hour,rate;
	public Lecturer() {
		//super();
		hour = 0;
		rate = 0;
	}
	
	
	public void input(Scanner scan) {
		super.input(scan);
		System.out.print("Enter hour ="); hour = scan.nextInt();
	}
}
