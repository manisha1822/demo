package addon_DSA;

public class Post_Assignment_day9 {
	
	    public int[] searchRange(int[] nums, int target) {
	        int[] result = {-1, -1};
	        result[0] = findBound(nums, target, true);
	        if (result[0] != -1) {
	            result[1] = findBound(nums, target, false);
	        }
	        return result;
	    }

	    private int findBound(int[] nums, int target, boolean isFirst) {
	        int left = 0, right = nums.length - 1, bound = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] == target) {
	                bound = mid;
	                if (isFirst) right = mid - 1;
	                else left = mid + 1;
	            } else if (nums[mid] < target) left = mid + 1;
	            else right = mid - 1;
	        }
	        return bound;
	    }
	}



