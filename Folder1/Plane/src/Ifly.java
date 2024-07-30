
public class Ifly implements Fly{
    
	private Iplane plane;
	public Ifly(Iplane plane) {
		this.plane = plane;
	}
	@Override
    public void flying() {
    	this.plane.fly();
    }
}
