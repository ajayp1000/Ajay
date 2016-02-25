package basics;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String reverse = "";
		System.out.println("Enter a String to reverse");
		String s = new Scanner(System.in).nextLine();
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		System.out.println("reversed String is:"+reverse);

		if (s.equals(reverse))
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}
