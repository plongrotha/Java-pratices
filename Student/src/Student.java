import java.util.Scanner;
public class Student {
	private int id;
	private String name;
    private int age;
    private String addr;
	public static void header() {
    	System.out.println("ID\t\tName\t\tAge\tAddress");
    }
    public void input() {
    	try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter Id      ="); id = scan.nextInt();
			scan.nextLine();
			System.out.print("Enter Name    ="); name = scan.nextLine();
			System.out.print("Enter Age     ="); age = scan.nextInt();
			scan.nextLine();
			System.out.print("Enter Address ="); addr =scan.nextLine();
		}
    }
    public void output() {
    	String sr = "";
    	sr = sr +id+"\t\t"+name+"\t\t"+age+"\t"+addr;
    	System.out.println(sr);
    }
    
}
