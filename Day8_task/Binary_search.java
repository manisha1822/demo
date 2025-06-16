package addon_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
	public static void main(String[]args) {
		int[]arr= {34,56,70,94,64,7,90,12,10,55,78};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter a value to find its index");
		Scanner sc=new Scanner(System.in);
		int find=sc.nextInt();
		int left=0;
		int right=arr.length-1;
		int mid;
		boolean flag=true;
		while(left<=right) {
			mid=(left+right)/2;
			if(arr[mid]==find)
			{
				System.out.println("value found "+arr[mid]+"at index"+mid);
				flag=true;
				break;
			}
			else if(find>arr[mid]) {
				left=mid+1;
			}
			else if(find<arr[mid]) {
				right=mid-1;
			}	
			}
			if(flag==false) {
			System.out.println("value not found");
			
		}
		
	}
	}


