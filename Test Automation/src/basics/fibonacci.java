package basics;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println("Enter the value");
		int n = new Scanner(System.in).nextInt();
		if (n == 1)
			System.out.print(n1);
		else if (n == 2)
			System.out.print(n1 + " " + n2);
		else {
			System.out.print(n1 + " " + n2);
			for (int j = 2; j <= n; j++) {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
			}
		}

	}

}
