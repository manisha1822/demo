package addon_DSA;

public class Post_assignment_day7 {
	

	    
	    public static void merge(int[] arr, int left, int mid, int right) {
	       
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	       
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	       
	        System.arraycopy(arr, left, leftArray, 0, n1);
	        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

	      
	        int i = 0; 
	        int j = 0; 
	        int k = left; 

	       
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }

	      
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }

	   
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            
	            int mid = left + (right - left) / 2;

	            
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	           
	            merge(arr, left, mid, right);
	        }
	    }

	    
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	       
	        int[] arr = {12, 11, 13, 5, 6, 7};

	        System.out.println("Original array:");
	        printArray(arr);

	       
	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted array:");
	        printArray(arr);
	    }
	}



