
import java.lang.reflect.*;

class Demo4{
	 
	 		public static void main(String args[]) throws ClassNotFoundException{
				Class c1 = Boolean.class;
				System.out.println(c1.getName());
				Class c2 = Integer.class;
				System.out.println(c2.getName());	
				Class c3 = Demo4.class;
				System.out.println(c3.getName());	
		 	}	 
		 }
