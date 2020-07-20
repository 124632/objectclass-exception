package objactclass;

public class ShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		Gun gun = new Gun();
		Gun gun1 =(Gun) gun.clone();
		gun.type="Snippers";
		gun. bullet.size = 20;
		System.out.println("Gun:"+gun);
		System.out.println("copy of Gun:"+gun1);

	}

}
