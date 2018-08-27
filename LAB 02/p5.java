import java.lang.reflect.*;

class Dummy{

	int i=0;
	int j=1;
	int k=2;	
    
    void foo1(){
        System.out.println("hello foo()");
    }
    void foo2(){
        System.out.println("hello foo()");
    }
    void foo3(){
        System.out.println("hello foo()");
    }
    
}

class Test{
    public static void main(String[] args) throws Exception {
        
        Method m[] = Dummy.class.getDeclaredMethods(); //returns all method members of the class
        for(int i=0;i<m.length;i++){
        	System.out.println(m[i]);
        }
        
        Field f[] = Dummy.class.getDeclaredFields();  //returns all data members of the class
        for(int i=0;i<f.length;i++){
        	System.out.println(f[i]);
        }
        
    }
}
