package interitence;
import java.util.*;
public class Person {
     int id;
     String name,sc;
     int age;
     char sex;
     String st = "";
     
     public Person() {
    	id = 0;
    	name = "unknown";
    	age = 0;
    	sex = 'n';
     }
     public Person(int id,String name,int age,char sex) {
    	 this.id = id;
    	 this.name = name;
    	 this.age = age;
    	 this.sex = sex;
     }
     public void input(Scanner scan) {
    	 System.out.print("Enter id =  "); id = scan.nextInt();
    	 sc=scan.nextLine();
    	 System.out.print("Enter name =  "); name = scan.nextLine();
    	 System.out.print("Enter age =  "); id = scan.nextInt();
    	 System.out.print("Enter sex =  "); sex = scan.next().charAt(sex);
     }
     public void output() {
    	 st+=id+"\t\t"+name+"\t\t"+age+"\t\t"+sex;
     }
}
