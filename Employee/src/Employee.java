
public class Employee {
       private int id;
       private String name;
       private int age;
       private float salary;
       private long tel;
       
       public int getId() {
    	   return id;
       }
       public String getName() {
    	   return name;
       }
       public int getAge() {
    	   return age;
       }
       public float getSalary() {
    	   return salary;
       }
       public long getTel() {
    	   return tel;
       }
       
       public void Getinfo(int id,String name,int age,float salary,int tel) {
    	   this.id=id;
    	   this.name=name;
    	   this.age=age;
    	   this.salary=salary;
    	   this.tel=tel;
       }
}
