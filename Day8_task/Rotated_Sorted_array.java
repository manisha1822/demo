package addon_DSA;

public class Rotated_Sorted_array {
	
	    
	    public static int search(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	           
	            if (nums[mid] == target) {
	                return mid;
	            }
	            
	          
	            if (nums[left] <= nums[mid]) { 
	                if (nums[left] <= target && target < nums[mid]) {
	                    right = mid - 1; 
	                } else {
	                    left = mid + 1;  
	                }
	            } else { 
	                if (nums[mid] < target && target <= nums[right]) {
	                    left = mid + 1;   
	                } else {
	                    right = mid - 1;
	                }
	            }
	        }
	        
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] nums = {6, 7, 9, 15, 19, 2, 3};
	        int target = 15;
	        int result = search(nums, target);
	        System.out.println("Target found at index: " + result);
	    }
	}



