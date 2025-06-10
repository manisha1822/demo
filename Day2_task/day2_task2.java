package addon_DSA;

import java.util.Scanner;

public class day2_task2 {
	public static int Duplicate(int[]nums) {
		if (nums.length==0) {
			return 0;
		}
			int i=0;
			for(int j=1;j<nums.length;j++);
			
			int j = 1;
			if(nums[j]!=nums[i]) {
				i++;
				nums[i]=nums[j];
				
			}
	
		return i+1;
}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[]nums=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int length=Duplicate(nums);
		System.out.println("remove duplicate");
		for(int i=0;i<length;i++) {
			System.out.println(nums[i]);
		}
		
	}	
		
}


