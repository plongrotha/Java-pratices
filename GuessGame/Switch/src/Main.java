import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	try(Scanner scan = new Scanner(System.in)){
		int f=1,i,n,option;
		System.out.println("-----------------------------");
		System.out.println("1. loop");
		System.out.println("2. Exit");
		System.out.print("Choose Option :"); option = scan.nextInt();
		switch(option) {
		case 1:
			int op;
			System.out.println("1. For loop");
			System.out.println("2. While loop");
			System.out.println("2. Do While loop");
			System.out.print("Enter option :"); op = scan.nextInt();
			switch(op) {
			case 1:
				System.out.println("--for loop--");
				System.out.print("Enter n :"); n = scan.nextInt();
				for(i=1; i<=n; i++) {
					f*=i;
				}System.out.println("1*2*3*...*n = "+f);
				break;
			case 2:
				System.out.println("--while loop--");
				System.out.print("Enter n :"); n = scan.nextInt();
				i=1;
				while(i<=n) {
					f*=i;
					i++;
				}System.out.println("1*2*3*...*n = "+f);
				break;
			case 3:
				System.out.println("--do while loop--");
			    System.out.print("Enter n :"); n = scan.nextInt();
			    i=1;
			    do {
			    	f*=i;
			    	i++;
			    }while(i<=n);
			    System.out.println("1*2*3*...*n = "+f);
			    break;
			}
			break;
		case 2:
			break;
		
		}
	}
		 

	}

}
