package constructor;

public class Gun1 {
String gunName;
int noOfBullets;
//constructor
public Gun1(String gunName,int noOfBullets) {
	this.gunName=gunName;
	this.noOfBullets=noOfBullets;
}
//non static method
public void shoot() {
	for(int i =1; i<=noOfBullets;i++) {
		System.out.println("deshoom");
	}
}
}
