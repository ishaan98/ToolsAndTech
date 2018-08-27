
import java.lang.reflect.*;

class MyClass3{}
		 
class Demo3{
		 
 	void printName(Object ob){
		Class c = ob.getClass();
 		System.out.println(c.getName());	
 	}		 
}
		 
class Test{
		 
	public static void main(String args[]) throws ClassNotFoundException{
		MyClass3 ob1 = new MyClass3();
		Demo3 ob2 = new Demo3();
		ob2.printName(ob1);
	}
		 
}
