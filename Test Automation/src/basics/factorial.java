package basics;

import java.util.Scanner;

public class factorial {

	public static void main(String args[]) {
		int fact = 1;
		System.out.println("Enter a integer");
		int in = new Scanner(System.in).nextInt();
		if (in < 0)
			System.out.println("Enter a positive number");
		else {
			for (int c = 1; c <= in; c++)
				fact = fact * c;
		}
		System.out.println("factorial of" + in + " is:" + fact);

	}

}
