package errMsg1;

public class ErrorMsg {
     String msgs[] = {"Output Error","Full Storage","Your Internet lost Connection","Low bettery"};
         String getErr(int i) {
        	 if(i>=0 & i <msgs.length)
        		 return msgs[i];
        	 else 
        		 return "Invalid code";
         }
}
