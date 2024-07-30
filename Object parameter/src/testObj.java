
public class testObj {

	public static void main(String[] args) {
	   Test obj1 = new Test(2);
	   Test obj2;
	   obj2 = obj1.increByTen(); 
	   System.out.println("obj1.a =" +obj1.a);
	   System.out.println("obj2.a ="+obj2.a);  
	   obj2 = obj2.increByTen();
	   System.out.println("obj2.a at second time ="+obj2.a);
	   System.out.println("hello my name is Rotha");
	}
}
