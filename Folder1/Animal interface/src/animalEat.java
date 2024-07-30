
public class animalEat implements Eat{
    
	private IAnimal animal;
	animalEat(IAnimal animal){
		this.animal=animal;
	}
	@Override
	public void eating() {
		this.animal.eat();
	}
	@Override
	public void Sound() {
		this.animal.sound();
	}
	@Override
	public void Behavior() {
		this.animal.behavior();
	}
}
