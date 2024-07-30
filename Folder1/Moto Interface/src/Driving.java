
public class Driving implements Drive{
    
	private Moto moto;
	public Driving(Moto moto) {
		this.moto = moto;
	}
	@Override
	public void driving() {
		this.moto.drive();
	}
}
