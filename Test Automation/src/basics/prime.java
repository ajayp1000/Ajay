package basics;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int b;
		int a= new Scanner(System.in).nextInt();
		b=(a/2)+1;
		for(int i=2;i<=b;i++)
		{
			if(a%i==0)
			{
				System.out.println("not prime");
			}
			else
				System.out.println("prime");
		}
		
		

	}

}
