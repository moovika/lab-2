package lab2;
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
public static void main(String[] args) 
	{
		double currentSalary; //employee's current salary
		double raise; // amount of the raise
		double newSalary; // new salary	for the employee
		String rating; // performance rating
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary:");
		currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating(Excellent,Good, or Poor): ");
        rating = scan.nextLine();
        // Compute the raise using if ...
        newsalary = currentSalary + raise;
        // Print the results
        NumberFormat money =
        		NumberFormat.getCurrencyInstance();
        		System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
	}
}

