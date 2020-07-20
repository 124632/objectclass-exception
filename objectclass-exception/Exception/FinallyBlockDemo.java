package Exception;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Started");
		try {
			System.out.println(10/0);
			System.out.println("Inside try");
		}
		catch(ArithmeticException ne) {
			System.out.println(ne.getMessage());
		}
		catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Its finally block");
		}
		System.out.println("Main ended...");
		

	}

}
