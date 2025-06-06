package addon_DSA;

import java.util.Scanner;

public class Task3 {
public static int factorial(int n) {
	if (n==0||n==1) {
		return 1;
	}
		else 
			return n*factorial(n-1);
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		System.out.println(factorial(num));
	}
	
}

