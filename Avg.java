package lab2;

public class Avg {
public static void main(String[] args) {
	int n=args.length;
	float [] x=new float[n];
	for (int i=0; i<n; i++) {
		x[i]=Float.parseFloat( args[i]);
	}
	float sum=0;
	for(int i=0; i<n; i++)
	     sum=sum+x[i];
	 float avg=sum/n;
	 System.out.print("Average of given number is"+avg);
}
}
