package lab2;
// java program to illustrate while loop
public class WhileLoopDemo {
   public static void main(String[] args) 
	   {
		   int x = 1, sum = 0;
		   // Exit when x becomes greater than 4
		   while (x <= 10) {
			   // summing up x
			   sum = sum + x;
			   // Increment the value of x for
			   // next iteration
			   x++;
		   }
		   System.out.println("summation: " + sum);		   
		   }
	   }

