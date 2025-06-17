package addon_DSA;

public class Upper_Bound {
	
	   
	    public static int upperBound(int[] arr, int target) {
	        int left = 0, right = arr.length;

	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            
	           
	            if (arr[mid] <= target) {
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
	        
	       
	        int result = upperBound(arr, target);
	        System.out.println("The upper bound of " + target + " is at index: " + result);
	    }
	}



