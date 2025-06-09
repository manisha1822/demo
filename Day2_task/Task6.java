package addon_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");
		int range =sc.nextInt();
		int[] array =new int[range];
		System.out.print("enter the element:");
		
		
		for(int i=0;i<range;i++) {
		array[i]=sc.nextInt();
	}
					
	
		int i = 0;
		int j = array.length-1;
		while(i<j){
		int temp=array[j];
		array[j]=array[i];
		array[i]=temp;
		i++;
		j--;
	}
	System.out.println(Arrays.toString(array));
}
}	
		
		
		
		
	

	
	

	


