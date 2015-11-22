import lejos.nxt.Motor; 
public class RunTest { 
	   public static void main(String[] args) throws Exception { 
        Motor.A.rotate(400, true); 
	       Motor.B.rotate(400); 
	       Motor.A.rotate(600); 
        Motor.A.rotate(1000, true); 
	       Motor.B.rotate(1000); 
	       Motor.B.rotate(750); 
        Motor.A.rotate(3300, true); 
	       Motor.B.rotate(3300); 
	       Motor.A.rotate(500); 
        Motor.A.rotate(1000, true); 
	       Motor.B.rotate(1000); 
	   } 
}