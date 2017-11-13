package tip17;

import java.util.Date;

public class Sub extends Super {
	private final Date date;  
	  
	  
    public Sub() {  
        date = new Date();  
        
    }  
  
  
    public void method() {  
        System.out.println(date);  
    }  
  
  
    public static void main(String[] args) {  
        Sub s = new Sub();  
        s.method();  
    }  
}
