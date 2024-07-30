
public class mainOfmoto {
    private static Moto honda;
    private static Moto today;
    private static Moto susuki;
    
    public static Moto getHonda() {
    	return honda;
    }
    public static void setHonda(Moto honda) {
    	mainOfmoto.honda = honda;
    }
    public static Moto getToday() {
    	return today;
    }
    public static void setToday(Moto today) {
    	mainOfmoto.today = today;
    }
    public static Moto getSusuki() {
    	return susuki;
    }
    public static void setSusuki(Moto susuki) {
    	mainOfmoto.susuki = susuki;
    }
	public static void main(String[] args) {
		setHonda(new Honda());
		setToday(new Today());
		setSusuki(new Susuki());
		Driving rider = new Driving(honda);
		rider.driving();
		

	}

}
