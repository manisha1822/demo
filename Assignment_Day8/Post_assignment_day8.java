package addon_DSA;

public class Post_assignment_day8 {
	

	    
	    public static int findFirstOccurrence(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                result = mid;
	                right = mid - 1;  
	            } else if (nums[mid] < target) {
	                left = mid + 1;  
	            } else {
	                right = mid - 1; 
	            }
	        }
	        
	        return result;
	    }

	   
	    public static int findLastOccurrence(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;
	        int result = -1; 

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) {
	                result = mid;
	                left = mid + 1;  
	            } else if (nums[mid] < target) {
	                left = mid + 1;  
	            } else {
	                right = mid - 1; 
	            }
	        }

	        return result;
	    }

	   
	    public static int countFrequency(int[] nums, int target) {
	        int firstIndex = findFirstOccurrence(nums, target);
	        if (firstIndex == -1) {
	            return 0; 
	        }

	        int lastIndex = findLastOccurrence(nums, target);

	        
	        return lastIndex - firstIndex + 1;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 6, 7, 8};
	        int target = 2;

	        int frequency = countFrequency(nums, target);
	        System.out.println("The frequency of " + target + " is: " + frequency); 
	    }
	}


