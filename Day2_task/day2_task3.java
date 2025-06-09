package addon_DSA;

import java.util.Scanner;

public class day2_task3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		int left=0,right=s.length()-1;
		boolean isPalindrome=true;
		while(left<right) {
			if(s.charAt(left++)!=s.charAt(right--)) {
			isPalindrome=false;
			break;
			}
		}
		System.out.println(isPalindrome);
		
		}
		
	}

	

