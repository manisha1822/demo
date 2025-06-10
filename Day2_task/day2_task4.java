package addon_DSA;

import java.util.Scanner;

public class day2_task4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[]nums=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
	   }
		
		
		
	
    
}
	
	
	public static void Decending(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
				}
			}
		}
		
	}
}