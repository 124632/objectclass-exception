package Exception;

public class ExceptionCallStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Compute(5,0);
		}
		catch (IndexOutOfBoundsException a) {
			System.out.println("Exception caught:"+a.getMessage());
		}
		
		}
	  static void Compute(int a, int b) {
		  try {
		  divide(a,b);
	  }
		  catch(ArithmeticException e) {
			   e.getMessage();
			      
			  
		  }
		  System.out.println("exception handler");
	  }
	    static  void divide(int a,int b) {
	    	System.out.println(a/b);
	    }

     }
