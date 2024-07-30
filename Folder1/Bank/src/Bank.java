import java.util.Scanner;

public class Bank {
	private int id;
	private String name;
	private float amount;
	float total, money, wid;
	String sr;

	public Bank() {
	}

	public Bank(int id, String name, float amount, float total) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getAmount() {
		return amount;
	}

	public float getTotal() {
		return total;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public static void header() {
		System.out.println("ID\tName\t\tAmount\t\tDeposit\t\tDeposited\tWidthdraw\tWidthdrawed");
	}

	// Scanner scan = new Scanner(System.in);
	public void input(Scanner scan) {
		System.out.print("Enter id       = ");
		id = scan.nextInt();
		sr = scan.nextLine();
		System.out.print("Enter name     = ");
		name = scan.nextLine();
		System.out.print("Enter amount   = ");
		amount = scan.nextFloat();
		System.out.print("Enter money to diposit =");
		money = scan.nextFloat();
		System.out.print("Enter money to widthdraw =");
		wid = scan.nextFloat();
	}

	public void output() {
		String st = "";
		st = st + id + "\t" + name + "\t\t" + amount + "$" + "\t\t" + money + "$" + "\t\t" + Deposit(money) + "$"
				+ "\t\t" + wid + "$" + "\t\t" + Widthdraw(wid) + "$";
		System.out.println(st);
	}

	public static void underOutput() {
		System.out.println("-".repeat(100));
	}

	public static void footer() {
		System.out.println("-".repeat(100));
	}

	public float Deposit(float money) {
		return (amount += money);
	}

	public float Widthdraw(float money) {
		if (money < amount) {
			total = amount - money;
		} else {
			System.out.println("In your account don't enough money");
		}
		return total;
	}
}
	