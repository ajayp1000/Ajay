package basics;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class swap {
	public static void main(String[] args) {

		System.out.println("Enter two variable");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a:" + a + " b:" + b);
		System.out.println("After Swaping");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a:" + a + " b:" + b);

	}

}
