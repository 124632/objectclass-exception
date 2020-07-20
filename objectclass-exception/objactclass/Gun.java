package objactclass;

public class Gun implements Cloneable {
	String type = "AK47";
	double weight = 1.5;
	 Bullet	 bullet = new Bullet();
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
			
		}
	
		 @Override
		public String toString() {
			return "Gun [type=" + type + ", weight=" + weight + ", bullet=" + bullet + "]";
		}
}
