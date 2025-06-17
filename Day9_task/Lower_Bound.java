package addon_DSA;

public class Lower_Bound {
	

	   
	    public static int lowerBound(int[] arr, int target) {
	        int left = 0, right = arr.length;

	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            
	           
	            if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	               
	                right = mid;
	            }
	        }

	        return left;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 6, 8, 10};
	        int target = 7;
	        
	       
	        int result = lowerBound(arr, target);
	        System.out.println("The lower bound of " + target + " is at index: " + result);
	    }
	}



