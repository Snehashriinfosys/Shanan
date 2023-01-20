package constructor;

public class PupG {//ulc
	public static void main(String[] args) {
		Gun g1 =new Gun ();//zero parameter constructor
		g1.gunName="AK47";
		g1.noOfBullet=6;
		g1.shoot();
		
		Gun g2 = new Gun();
		g2.gunName ="pistol";
		g2.noOfBullet=10;
		g2.shoot();
		
		
		
	}

}
