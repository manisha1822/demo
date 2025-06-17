package addon_DSA;

public class count_target {
	

	   
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

	    
	    public static int countTarget(int[] arr, int target) {
	        int lower = lowerBound(arr, target);
	        int upper = upperBound(arr, target);
	        
	        return upper - lower;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 3, 5, 6, 8, 10};
	        int target = 3;
	        
	        
	        int result = countTarget(arr, target);
	        System.out.println("The count of " + target + " in the array is: " + result);
	    }
	}



