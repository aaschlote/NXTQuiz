package br.com.lejos;

import java.util.ArrayList;
import java.util.List;

public class LejosConstants {
	
	/**
	 * 400 anda uma unidade
	 */
	
		private static String programa1 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(2000, true); \r\n" 
				+ "	       Motor.B.rotate(2000); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa2 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(130, true); \r\n" 
				+ "	       Motor.B.rotate(130); \r\n" 
				+ "	       Motor.B.rotate(250); \r\n" 
				+ "        Motor.A.rotate(1400, true); \r\n" 
				+ "	       Motor.B.rotate(1400); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		
		private static String programa3 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(130, true); \r\n" 
				+ "	       Motor.B.rotate(130); \r\n" 
				+ "	       Motor.B.rotate(250); \r\n" 
				+ "        Motor.A.rotate(1050, true); \r\n" 
				+ "	       Motor.B.rotate(1050); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa4 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.B.rotate(500); \r\n" 
				+ "        Motor.A.rotate(1500, true); \r\n" 
				+ "	       Motor.B.rotate(1500); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa5 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.A.rotate(750); \r\n" 
				+ "        Motor.A.rotate(1800, true); \r\n" 
				+ "	       Motor.B.rotate(1800); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa6 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(2000, true); \r\n" 
				+ "	       Motor.B.rotate(2000); \r\n" 
				+ "        Motor.A.rotate(130, true); \r\n" 
				+ "	       Motor.B.rotate(130); \r\n" 
				+ "	       Motor.B.rotate(250); \r\n" 
				+ "        Motor.A.rotate(1400, true); \r\n" 
				+ "	       Motor.B.rotate(1400); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa7 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(130, true); \r\n" 
				+ "	       Motor.B.rotate(130); \r\n" 
				+ "	       Motor.B.rotate(250); \r\n" 
				+ "        Motor.A.rotate(1050, true); \r\n" 
				+ "	       Motor.B.rotate(1050); \r\n" 
				+ "	       Motor.B.rotate(500); \r\n" 
				+ "        Motor.A.rotate(1500, true); \r\n" 
				+ "	       Motor.B.rotate(1500); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa8 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.A.rotate(750); \r\n" 
				+ "        Motor.A.rotate(1800, true); \r\n" 
				+ "	       Motor.B.rotate(1800); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa9 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(2000, true); \r\n" 
				+ "	       Motor.B.rotate(2000); \r\n" 
				+ "        Motor.A.rotate(130, true); \r\n" 
				+ "	       Motor.B.rotate(130); \r\n" 
				+ "	       Motor.B.rotate(250); \r\n" 
				+ "        Motor.A.rotate(1400, true); \r\n" 
				+ "	       Motor.B.rotate(1400); \r\n" 
				+ "        Motor.A.rotate(130, true); \r\n" 
				+ "	       Motor.B.rotate(130); \r\n" 
				+ "	       Motor.B.rotate(250); \r\n" 
				+ "        Motor.A.rotate(1050, true); \r\n" 
				+ "	       Motor.B.rotate(1050); \r\n" 
				+ "	       Motor.B.rotate(500); \r\n" 
				+ "        Motor.A.rotate(1500, true); \r\n" 
				+ "	       Motor.B.rotate(1500); \r\n" 
				+ "	       Motor.A.rotate(750); \r\n" 
				+ "        Motor.A.rotate(1800, true); \r\n" 
				+ "	       Motor.B.rotate(1800); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa10 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(1200, true); \r\n" 
				+ "	       Motor.B.rotate(1200); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa11 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.B.rotate(700); \r\n" 
				+ "        Motor.A.rotate(2500, true); \r\n" 
				+ "	       Motor.B.rotate(2500); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa12 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.A.rotate(550); \r\n" 
				+ "        Motor.A.rotate(1300, true); \r\n" 
				+ "	       Motor.B.rotate(1300); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa13 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.B.rotate(550); \r\n" 
				+ "        Motor.A.rotate(500, true); \r\n" 
				+ "	       Motor.B.rotate(500); \r\n" 
				+ "	   } \r\n" 				
				+ "}"; 
		
		private static String programa14 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(1200, true); \r\n" 
				+ "	       Motor.B.rotate(1200); \r\n" 
				+ "	       Motor.B.rotate(700); \r\n" 
				+ "        Motor.A.rotate(2500, true); \r\n" 
				+ "	       Motor.B.rotate(2500); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa15 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.A.rotate(550); \r\n" 
				+ "        Motor.A.rotate(1300, true); \r\n" 
				+ "	       Motor.B.rotate(1300); \r\n" 
				+ "	       Motor.B.rotate(550); \r\n" 
				+ "        Motor.A.rotate(500, true); \r\n" 
				+ "	       Motor.B.rotate(500); \r\n" 
				+ "	   } \r\n" 				
				+ "}"; 
		
		private static String programa16 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(1200, true); \r\n" 
				+ "	       Motor.B.rotate(1200); \r\n" 
				+ "	       Motor.B.rotate(700); \r\n" 
				+ "        Motor.A.rotate(2500, true); \r\n" 
				+ "	       Motor.B.rotate(2500); \r\n" 
				+ "	       Motor.A.rotate(550); \r\n" 
				+ "        Motor.A.rotate(1300, true); \r\n" 
				+ "	       Motor.B.rotate(1300); \r\n" 
				+ "	       Motor.B.rotate(550); \r\n" 
				+ "        Motor.A.rotate(500, true); \r\n" 
				+ "	       Motor.B.rotate(500); \r\n" 
				+ "	   } \r\n" 				
				+ "}"; 
		
		
		private static String programa17 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(400, true); \r\n" 
				+ "	       Motor.B.rotate(400); \r\n" 
				+ "	   } \r\n"  
				+ "}"; 
		
		private static String programa18 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.A.rotate(600); \r\n" 
				+ "        Motor.A.rotate(1000, true); \r\n" 
				+ "	       Motor.B.rotate(1000); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa19 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.B.rotate(750); \r\n" 
				+ "        Motor.A.rotate(3300, true); \r\n" 
				+ "	       Motor.B.rotate(3300); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa20 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.A.rotate(500); \r\n" 
				+ "        Motor.A.rotate(1000, true); \r\n" 
				+ "	       Motor.B.rotate(1000); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa21 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(400, true); \r\n" 
				+ "	       Motor.B.rotate(400); \r\n" 
				+ "	       Motor.A.rotate(600); \r\n" 
				+ "        Motor.A.rotate(1000, true); \r\n" 
				+ "	       Motor.B.rotate(1000); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa22 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "	       Motor.B.rotate(750); \r\n" 
				+ "        Motor.A.rotate(3300, true); \r\n" 
				+ "	       Motor.B.rotate(3300); \r\n" 
				+ "	       Motor.A.rotate(500); \r\n" 
				+ "        Motor.A.rotate(1000, true); \r\n" 
				+ "	       Motor.B.rotate(1000); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
		
		private static String programa23 = 
				   "import lejos.nxt.Motor; \r\n"                     
				+ "public class RunTest { \r\n"
				+ "	   public static void main(String[] args) throws Exception { \r\n"
				+ "        Motor.A.rotate(400, true); \r\n" 
				+ "	       Motor.B.rotate(400); \r\n" 
				+ "	       Motor.A.rotate(600); \r\n" 
				+ "        Motor.A.rotate(1000, true); \r\n" 
				+ "	       Motor.B.rotate(1000); \r\n" 
				+ "	       Motor.B.rotate(750); \r\n" 
				+ "        Motor.A.rotate(3300, true); \r\n" 
				+ "	       Motor.B.rotate(3300); \r\n" 
				+ "	       Motor.A.rotate(500); \r\n" 
				+ "        Motor.A.rotate(1000, true); \r\n" 
				+ "	       Motor.B.rotate(1000); \r\n" 
				+ "	   } \r\n" 
				+ "}"; 
				
	
	private static List<String> programas = new ArrayList<String>();
	
	public static String getPrograma(int index){
		return programas.get(index);
		
	}
	
	static {
		programas.add(programa1);
		programas.add(programa2);
		programas.add(programa3);
		programas.add(programa4);
		programas.add(programa5);
		programas.add(programa6);
		programas.add(programa7);
		programas.add(programa8);
		programas.add(programa9);
		programas.add(programa10);
		programas.add(programa11); 			
		programas.add(programa12); 
		programas.add(programa13); 
		programas.add(programa14); 
		programas.add(programa15);
		programas.add(programa16); 
		programas.add(programa17); 
		programas.add(programa18);
		programas.add(programa19); 
		programas.add(programa20); 
		programas.add(programa21); 
		programas.add(programa22); 
		programas.add(programa23); 
	}
}
