import java.util.Scanner;

public class Variables {
	private int n;
	private int x;
	private int y;
	private int z;
	
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Variables(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		n = sc.nextInt();
		System.out.println("Enter X: ");
		x = sc.nextInt();
		System.out.println("Enter Y: ");
		y = sc.nextInt();
		System.out.println("Enter Z: ");
		z = sc.nextInt();
		sc.close();
	}
}
