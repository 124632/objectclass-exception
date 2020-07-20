package objactclass;

public class DeepcopyDemo {

	public static void main(String[] args)  throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Gun gun = new Gun();
		Gun gun1 = (Gun) gun.clone();
		gun. bullet.size = 20;
		System.out.print(gun);
		System.out.print(gun1);

	}

}
