package lab2;

public class Cs {
int p,q;
public Cs() {}
public Cs(int x, int y) {
	p=x;
	q=y;
}
public int add(int i,int j) {
	return (i+j);
}
public int add(int i, int j, int k) {
	return (i+j+k);
}
public float add(float f1, float f2) {
	return (f1+f2);
}
public void printData() {
	System.out.print("p = "+p);
	System.out.print(" q = "+q);
}
}

		