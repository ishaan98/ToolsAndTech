import java.util.*;


interface Product{
	String p_name = "Split AC";
	int price  = 42000;
	void details();
}

class Demo2{

	public static void main(String args[]){
		Product ob = new Product(){
			
			/*
			public because methods in interface are by default public 
			and methods in class are by default 'default' type.
			Hence we need to declare public while overriding methods.
			*/
			
			public void details(){
				System.out.println("Product name: "+p_name);
				System.out.println("Price: "+price);	
			}
		
		};
		ob.details();
	}	

}
