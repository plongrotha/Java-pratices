
public class GDemo {
   int x;
   
   GDemo(int i){
	   x = i;
   }
   protected void finalize() {
	   System.out.println("Finalizing"+x );
   }
   void generate(int i) {
	   GDemo o = new GDemo(i);
   }
}
