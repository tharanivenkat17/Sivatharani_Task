package Abstraction;

public class Nested_Try {
	public static void main(String[] args) { 
		  try{
			  try
			  {   
				  int number =39/0;
		          System.out.println("in");
			  } 
//			  System.out.println("Execute");
			  catch(ArrayIndexOutOfBoundsException e)  
			  {  
			    System.out.println(e);  
			  }
			  finally {
				  System.out.println("Finally Execute");
			  }
		      System.out.println("Execute");
		  }
		  
		  catch(ArithmeticException e){
			  System.out.println(e);
		  }
		  
		  System.out.println("Outer try");
	}
}