import java.util.*;
public class ExceptionNumber extends Exception{
   private String msg;

   public ExceptionNumber(){
      msg = "Invalid number";
   }
   public ExceptionNumber(String msg){
      this.msg = msg;
   }

   public String getMessage(){
      return msg;
   }
   

}
