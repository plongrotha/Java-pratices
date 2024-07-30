import java.util.Scanner;
public class BoxDemo {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			box b1 = new box();
			double vol;
			
			b1.Setdimension(11, 55, 6);
			vol = b1.volume();
			System.out.println("volume of the box is ="+vol);
			/*System.out.print("Enter Width  ="); b1.width=scan.nextDouble();
			System.out.print("Enter Length ="); b1.length=scan.nextDouble();
			System.out.print("Enter Depth  ="); b1.depth=scan.nextDouble();
			vol = b1.volume();
			System.out.println("Volume of Box is ="+vol); */			
		}

	}

}
