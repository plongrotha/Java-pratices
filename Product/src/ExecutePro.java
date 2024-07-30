
import java.util.Scanner;
public class ExecutePro {

	public static void main(String[] args) {
		int n;
		product p = new product();
		product p1 = new product(9002,"MSI",546);
		product p2 = new product();
		System.out.println("*********************");
		try(Scanner scan = new Scanner(System.in)){
			System.out.print("Enter element of Product ="); n = scan.nextInt();
			for(int i=1; i<=n; i++) {
				p2.input();
			}
		}
		System.out.println("------------------------------------");
		product.header();
		p.output();
		p1.output();	
		p2.output();
		System.out.println("------------------------------------");
		
	}

}
