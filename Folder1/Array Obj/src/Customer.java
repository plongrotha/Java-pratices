import java.util.Scanner;
public class Customer {
    private int id;
    private String name;
    private float amount;
    String s;
    String st = "";
    
    public Customer() {
    	id = 0;
    	name = "unknown";
    	amount = 0;
    }
    public Customer(int id,String name,float amount) {
    	this.id = id;
    	this.name = name;
    	this.amount = amount;
    }
    public void input(Scanner scan) {
    	System.out.print("Enter id ="); id =scan.nextInt();
    	s=scan.nextLine();
    	System.out.print("Enter name ="); name =scan.nextLine();
    	System.out.print("Enter amount ="); amount =scan.nextFloat();
    }
    public void output() {
        st+=id+"\t"+name+"\t"+amount;
        System.out.println(st);
    }
    public void deposit(float deposit) {
    	amount+=deposit;
    }
    public void withdraw(float deposit) {
    	if(amount>=deposit)
    		amount = deposit;
    }
    public float getId() {
    	return id;
    }
    public float getAmount() {
    	return amount;
    }
}
