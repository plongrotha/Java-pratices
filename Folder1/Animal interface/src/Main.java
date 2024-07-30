
public class Main {
     
	private static IAnimal giraffe;
	private static IAnimal tiger;
	private static IAnimal cow;
	
	public static IAnimal getGiraffe() {
		return giraffe;
	}
	public static void setGiraffe(IAnimal giraffe) {
		Main.giraffe=giraffe;
	}
	public static IAnimal getCow() {
		return cow;
	}
	public static void setCow(IAnimal cow) {
		Main.cow=cow;
	}
	public static IAnimal getTiger() {
		return tiger;
	}
	public static void setTiger(IAnimal tiger) {
		Main.tiger=tiger;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setCow(new Cow());
		setTiger(new Tiger());
		setGiraffe(new Giraffe());
		animalEat feed = new animalEat(cow);
		feed.eating();
		feed.Sound();
		feed.Behavior();
	}

}
