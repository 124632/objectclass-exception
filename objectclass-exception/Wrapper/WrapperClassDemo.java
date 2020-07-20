package Wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer b=a;
		System.out.println("b:"+b);
		Integer c= new Integer(a);
		System.out.println("c:"+c);
		Integer x=20;
		int y=x;
		System.out.println("y:"+y);
		int z=x.intValue();
		System.out.println("z:"+z);

	}

}
