
public class Mytime {
      private int hour,minute,second;
      
      
//      public Mytime(int h, int m, int s) {
//		this.hour = h;
//		this.minute = m;
//		this.second = s;
//	}
	int checkHour(int h) {
    	  if(h<0 || h>60) {
    		  System.out.println("Invalid Hour");
    		  return 1;
    	  }
    	  else {
    		  return h;
    	  }
      }
      int checkMinute(int m) {
    	  if(m<0 || m>60) {
    		  System.out.println("Invalid Minute");
    		  return 1;
    	  }else {
    		  return m;
    	  }
      }
      int checkSecond(int s) {
    	  if(s<0 || s>60) {
    		  System.out.println("Invalid Second");
              return 1;
    	  }else {
    		  return s;
    	  }
      }
      void checktime(int hour,int minute,int second) {
    	  if(second >= 60) {
    		  this.second = 0;
    		  minute+=1;
    	  }else {
    		  this.second = second;
    	  }
    	  
    	  if(minute >= 60) {
    		  this.minute = 0;
    		  hour+=1;
    	  }else {
    		  this.minute = minute;
    	  }
    	  
    	  if(hour >= 24) {
    		  this.hour = 0;
    	  }else {
    		  this.hour = hour;
    	  }
      }
      public void MyTime(int hour,int minute,int second) {
    	  checktime(checkHour(hour),checkMinute(minute),checkSecond(second));
      }
      
      public int getHour() {
    	  return this.hour;
      }
      public void setHour(int hour) {
    	  checktime(this.hour,checkMinute(minute),checkSecond(second));
      }
      public int getMinute() {
    	  return this.minute;
      }
      public void setMinute(int minute) {
    	  checktime(checkHour(hour),checkMinute(minute),checkSecond(second));
      }
      public int getSecond() {
    	  return this.second;
      }
      public void setSecond(int second) {
    	  checktime(this.hour,checkMinute(minute),checkSecond(second));
      }
      
      public void setTime(int hour,int minute,int second) {
    	  checktime(this.hour,checkMinute(minute),checkSecond(second));    	  
      }
      public void nextTenSecond() {
    	  checktime(this.hour,this.minute,this.second+=10);
      }
      public String toString() {
    	  return hour+":"+minute+":"+second;
      }
}
