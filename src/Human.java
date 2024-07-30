
public class Human {
      private String name;
      private int age;
      private String role;
      private int id;
      
      public void registor(int id,String name,int age,String role) {
    	  this.id = id;
    	  this.name = name;
    	  this.age = age;
    	  this.role = role;
      }
      public void getinfo() {
    	  System.out.println("id :"+id);
    	  System.out.println("name :"+ name);
    	  System.out.println("age :"+age);
    	  System.out.println("role :"+role);
    	  
    	  
      }
      
     
}
