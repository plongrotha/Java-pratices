
public class recursive {

	public static void main(String[] args) {
		RecTest ob = new RecTest(10);
		int i;
		for(i=0; i<10; i++)
			ob.value[i] = i;
		ob.printarr(i);

	}

}
