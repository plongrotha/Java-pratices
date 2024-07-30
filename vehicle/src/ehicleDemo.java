import java.util.Scanner;
public class ehicleDemo {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			vehicle minivan = new vehicle();
			double gallon;
			int dist =252;
			System.out.print("Enter how many passengers ="); minivan.passengers=scan.nextInt();
			System.out.print("Enter fuelcap ="); minivan.fuelcap=scan.nextInt();
			System.out.print("Enter mpg ="); minivan.mpg=scan.nextInt();
			
			gallon = minivan.fuelneeded(dist);
			System.out.println("to go "+ dist +" miles miniVan need "+gallon+"ngallons of fuel");
		}
//		vehicle racingCar= new vehicle();
//		double rang1,rang2;
//		minivan.passengers = 10;
//		minivan.fuelcap = 23;
//		minivan.mpg = 7;
//		
//		racingCar.passengers = 22;
//		racingCar.fuelcap = 55;
//		racingCar.mpg = 12;
//		
//		rang1 = minivan.range();
//		rang2 = racingCar.range();
//	    System.out.println("miniVan can carry ="+minivan.passengers + " with a rang of :"+rang1+" miles");
//	    System.out.println("racingCar can carry ="+racingCar.passengers+ " with a rang of :"+rang2+" miles");
	    

	}
	
}