package training;
import java.util.*; 
	public class EO {
	 public static void main(String[] args)
	 {
	    int[] nums = {5, 7, 2, 4, 9};
		int even = 0, odd = 0;
		System.out.println("Original Array: "+Arrays.toString(nums)); 
		    
	    for(int i = 0; i < nums.length; i++) {
	        if(nums[i] % 2 == 0)
			{         
	          even++;
			}
			else
			  odd++;	
	    }                 
	    System.out.printf("\nNumber of even elements in the array: %d",even);
		System.out.printf("\nNumber of odd elements in the array: %d",odd);
		System.out.printf("\n");	
	  }
	}