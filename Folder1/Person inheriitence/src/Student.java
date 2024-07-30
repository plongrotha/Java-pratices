import java.util.Scanner;

public class Student extends Person{
   
	
	//private static final Scanner Scanner = null;
	double parentPhone;
	
	public Student(String name, String gender, String add, int i) {
		
	}
	public void input(Scanner scan) {
		super.input(scan);
		System.out.print("Enter Parent Number = "); parentPhone = scan.nextDouble();
	}
	public void output() {
		super.output();
		System.out.println("ParentNumber ="+parentPhone);
	}
}
