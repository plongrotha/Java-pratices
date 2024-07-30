
public class Exe {

	public static void main(String[] args) {
		Myclass my = new Myclass();
		
		my.setAlpha(-99);
		System.out.println("my.alpha ="+my.getalpha());
		my.beta=21;
		my.gamma=22;
        System.out.println(my.beta);
        System.out.println(my.gamma);
	}

}
