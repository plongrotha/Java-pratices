package interitence;

import java.util.Scanner;

public class Student extends Person{
     
	String st;
	float average;
	public Student(int i, String string, int j, char c, double d) {
		super();
		average = 10;
	}
	public Student(int id,String name,int age,char sex,float avg) {
	    super(id,name,age,sex);
	    average = avg;
	}
	public void input(Scanner scan) {
		super.input(scan);
		st=scan.nextLine();
		System.out.print("Enter Average ="); average =scan.nextFloat();
	}
	public void outut() {
		super.output();
		System.out.println(average+"\t");
		System.out.println("");
	}
}
