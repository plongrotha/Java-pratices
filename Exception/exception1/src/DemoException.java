import java.util.Scanner;
public class DemoException {
  
  public static void main(String[] args) throws ExceptionNumber {
    Scanner scan = new Scanner(System.in);
    int n;
    System.out.print("Enter number ="); n = scan.nextInt();
    if(n < 10 || n > 100) throw new ExceptionNumber();
    System.out.println(n+"is valid number");
  }
}
