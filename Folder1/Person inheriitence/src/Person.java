import java.util.Scanner;

public class Person {
      String name;
      String gender;
      String address;
      double phone;
      String st;
      public Person() {
    	  name = "";
    	  gender = "";
    	  address = "";
    	  phone = 0;
      }
      public Person(String n,String g,String a,double p) {
    	  name = n;
    	  gender = g;
    	  address = a;
    	  phone = p;
      }
      public void input(Scanner scan) {
    	  System.out.println("Enter name ="); name = scan.nextLine();
    	  System.out.println("Enter Gender ="); gender = scan.nextLine();
    	  System.out.println("Enter address ="); address =scan.nextLine();
    	  System.out.println("Enter Phone  ="); phone = scan.nextDouble();
      }
      public void output() {
    	  st+=name+"\t\t"+gender+"\t\t"+address+"\t\t"+phone;
    	  System.out.println(st);
      }
}
