package addon_DSA;
import java.util.Arrays;

public class Main_program_day8 {
	

	

	   
	    public static int binarySearch(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (nums[mid] == target) {
	                return mid;
	            } else if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        
	        return -1;  
	    }

	  
	    public static int linearSearch(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] == target) {
	                return i;
	            }
	        }
	        return -1; 
	    }

	  
	    public static int rotatedArraySearch(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (nums[mid] == target) {
	                return mid;
	            }
	            
	            
	            if (nums[left] <= nums[mid]) {
	                if (target >= nums[left] && target < nums[mid]) {
	                    right = mid - 1; 
	                } else {
	                    left = mid + 1; 
	                }
	            } else {  
	                if (target > nums[mid] && target <= nums[right]) {
	                    left = mid + 1;   
	                } else {
	                    right = mid - 1; 
	                }
	            }
	        }
	        
	        return -1; 
	    }

	    
	    public static int searchArray(int[] nums, int target) {
	       
	        if (nums[0] <= nums[nums.length - 1]) {
	           
	            System.out.println("Array is Binary Sorted.");
	            return binarySearch(nums, target);
	        } else {
	          
	            System.out.println("Array is Rotated Sorted.");
	            return rotatedArraySearch(nums, target);
	        }
	    }

	   
	    public static int linearSearchIfUnsorted(int[] nums, int target) {
	        System.out.println("Array is Linear Sorted (or Unsorted).");
	        return linearSearch(nums, target);
	    }

	   
	    public static void main(String[] args) {
	        int[] binarySortedArray = {1, 2, 3, 4, 5, 6, 7};
	        int[] rotatedSortedArray = {6, 7, 9, 15, 19, 2, 3}; 
	        int[] linearSortedArray = {11, 3, 7, 8, 5, 6};  
	        
	        int target = 15;  

	        System.out.println("Searching in Binary Sorted Array:");
	        System.out.println("Target found at index: " + searchArray(binarySortedArray, target));

	        System.out.println("\nSearching in Rotated Sorted Array:");
	        System.out.println("Target found at index: " + searchArray(rotatedSortedArray, target));

	        System.out.println("\nSearching in Linear (or Unsorted) Array:");
	        System.out.println("Target found at index: " + linearSearchIfUnsorted(linearSortedArray, target));
	    }
	}



