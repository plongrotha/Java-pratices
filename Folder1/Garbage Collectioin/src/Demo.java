
public class Demo {

	public static void main(String[] args) {
		int count;
		GDemo ob = new GDemo(0);
		for(count = 1;count < 10000; count++) {
			ob.generate(count);    
		}
	}
}
