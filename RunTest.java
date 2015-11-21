import lejos.nxt.Motor; 
public class RunTest { 
	   public static void main(String[] args) throws Exception { 
        Motor.A.rotate(1600, true); 
	       Motor.B.rotate(1600); 
	   } 
}