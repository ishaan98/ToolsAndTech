import java.lang.reflect.*;
		
class MyClass2{
}
		
class Demo2{

	public static void main(String args[]) throws ClassNotFoundException{
		Class c = Class.forName("MyClass2"); // creating instance of class 'Class'
		System.out.println(c.getName());
	}
		
}
