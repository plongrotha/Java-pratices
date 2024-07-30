
public class RecTest {
   int value[];
   RecTest(int i){
	   value = new int[i];
   }
   void printarr(int i) {
	   if( i == 0)
		   return ;
	   else 
		   printarr(i-1);
	   System.out.println("["+ (i-1)+"]"+value[i-1]);
   }
}
