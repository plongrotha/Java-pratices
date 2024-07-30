
public class Cow implements IAnimal{
    
	@Override
	public void eat() {
		System.out.println("Cow is eat grass");
	}
	@Override
	public void sound() {
		System.out.println("Mor!!! Mor!!!");
	}
	@Override
	public void behavior() {
		System.out.println("like green grass");
	}
}
