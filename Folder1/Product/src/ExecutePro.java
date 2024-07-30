
import java.util.Scanner;

public class ExecutePro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		product p = new product();
//		product p1 = new product(9002, "MSI", 546);
//		product p2 = new product();
		System.out.println("*********************");
		System.out.print("Enter element of Product =");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			p.input();
		}
		System.out.println("------------------------------------");
		product.header();
		for (int i = 1; i <= n; i++) {
//			p.input();
			p.output();
		}
		System.out.println("------------------------------------");

	}

}
