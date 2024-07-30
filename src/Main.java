//import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
		Human h = new Human();
		Human h2 = new Human();
		System.out.println("-------------------------");
		h.registor(9001,"Chheng SreyPich",22,"student");
		h.getinfo();
		System.out.println("-------------------------");
        h2.registor(9002,"Plong Rotha",20,"Software Engeneering"); 
        h2.getinfo();
	}

}
