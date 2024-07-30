
public class Main {
    private static Iplane boeing;
    private static Iplane jet;
    private static Iplane airbus;
    
    public static Iplane getBoeing() {
    	return boeing;
    }
    public static void setBoeing(Iplane boeing) {
         Main.boeing=boeing;
    }
    public static Iplane getJet() {
    	return jet;
    }
    public static void setJet(Iplane jet) {
    	Main.jet=jet;
    }
    public static Iplane getAirbus() {
    	return airbus;
    }
    public static void setAirbus(Iplane airbus) {
    	Main.airbus=airbus;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setBoeing(new Boeing());
        setJet(new Jet());
        setAirbus(new Airbus());
        Ifly controller = new Ifly(airbus);
        controller.flying();
	}

}
