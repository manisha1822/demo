package addon_DSA;

public class Main_Assignment_day9 {
	

	   
	    public static int findRank(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;

	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                
	                return mid + 1;
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        
	        return 0;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 6, 8, 10};
	        int target = 6;

	       
	        int rank = findRank(arr, target);
	        
	        if (rank != 0) {
	            System.out.println("The rank of " + target + " in the array is: " + rank);
	        } else {
	            System.out.println(target + " is not present in the array.");
	        }
	    }
	}



