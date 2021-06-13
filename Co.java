package lab2;

public class Co {
	public static void main(String[] args) {
		int x=2, y=3, z=4;
		Cs c=new Cs();
		Cs c1=new Cs(x, z );
		c1.printData();
		float m=7.2F, n=5.2F;
		int k=c.add(x, y);
		int t=c.add(x, y,z);
		float ft=c.add(m, n);
		System.out.println("k = "+k);
		System.out.println("t = "+t);
		System.out.println("ft= "+ft);
	}
}