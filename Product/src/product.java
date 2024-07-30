import java.util.Scanner;
public class product {
     int code;
     String name;
     float price;
     String s;
    
    product(){
    	code =1009;
    	name = "Dell";
    	price = 999;
    }
    product(int c,String n,float p){
    	code = c;
    	name = n;
    	price = p;
    }
    public static void header() {
    	System.out.println("Code\tName\t\tPrice");
    }
    public void input() {
    	try(Scanner scan = new Scanner(System.in)){
    		System.out.print("Enter code ="); code = scan.nextInt();
    		s = scan.nextLine();
    		System.out.print("Enter name ="); name = scan.nextLine();
    		System.out.print("Enter price="); price = scan.nextFloat();
    	}
	}
    public void output() {
    	String st = "";
    	st = st +code+"\t"+name+"\t\t"+price+"$";
    	System.out.println(st);
    }
    	
}

