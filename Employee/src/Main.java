
public class Main {

	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.Getinfo(9001, "Plong Rotha", 21, 1500,963471034);
		
		System.out.println("Id ="+em.getId());
		System.out.println("Name ="+em.getName());
		System.out.println("Age ="+em.getAge());
		System.out.println("Salary ="+em.getSalary()+"$");
		System.out.println("Tele ="+" +855 "+em.getTel());

	}

}
