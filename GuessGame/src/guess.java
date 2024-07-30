import java.util.Scanner;
public class guess {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int num;
			int guessNumber = 12;
			System.out.print("Enter a number to Win the Game :"); num = scan.nextInt();
			if(num == guessNumber) {
				System.out.println("Congratulations! You Won the game");
				System.out.println("Good luckk have a nice day");
			}else if(num < guessNumber) {
				System.out.println("It so low number");
			}else if(num > guessNumber) {
				System.out.println("It so high");
				System.out.println("Sorry! you lost the game");
			}
		}
	}

}


