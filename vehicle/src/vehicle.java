
public class vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
    int range() {
    	return fuelcap * mpg;
    }
    // create fuel method 
    double fuelneeded(int mile) {
    	return (double) mile*mpg;
    }
}
