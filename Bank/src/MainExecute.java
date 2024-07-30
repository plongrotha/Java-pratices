import java.util.*;
public class MainExecute {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter User =");int n = scan.nextInt();
			Bank[] bank = new Bank[n];
			for(int i=0; i<n; i++) {
				bank[i] = new Bank();
				bank[i].input(scan);
			}
			//System.out.println("*".repeat(100));
			System.out.println("-".repeat(50)+"Output"+"-".repeat(44));
			Bank.header();
			Bank.underOutput();
            for(int i=0; i<n; i++) {
            	
            	bank[i].output();
            }
            Bank.footer();
		}
	}

}
