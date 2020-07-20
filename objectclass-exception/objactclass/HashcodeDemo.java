package objactclass;

public class HashcodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroplane aeroplane1 = new  Aeroplane("emirates","domestic");
		Aeroplane aeroplane2 = new  Aeroplane("emirates","domestic");
		
		
		
		System.out.println(aeroplane1.hashCode());
		System.out.println(aeroplane1);
		System.out.println(aeroplane1.equals(aeroplane2));
	}

}
