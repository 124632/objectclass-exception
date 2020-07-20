package Exception;

public class ExceptionWithMethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		try {
			child.scold();
			child.care();
		} catch (HumanExp | PersonExp e) {
			System.out.println(e);
		}
		

	}

}
