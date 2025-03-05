public class LongestSubstringArray {

	public static void main(String[] args) {
		int [] nums = {0,1,1,1,0,1,1,0,1};
		int left = 0, maxLength = 0, zerCount =0;
	    for(int right = 0; right < nums.length ; right++){
	        if(nums[right] == 0) zerCount++;
	        while(zerCount > 1){
	            if(nums[left] ==0) zerCount--;
	            left++;
	        }
	        maxLength = Math.max(maxLength , right -left +1);
	    }
	    System.out.println("maxLength = "+ maxLength);

	}

}