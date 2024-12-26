public class MaximumAverageSubarrayI {

	public static double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int i = 0; i<k ;i++){
            sum +=nums[i];
        } 
        int maxSum = sum;
        int startIndex = 0;
        int endIndex = k;
        while(endIndex <nums.length){
            sum -= nums[startIndex];
            startIndex++;
            sum +=nums[endIndex];
            endIndex++;
            maxSum = Math.max(maxSum , sum);
        }
         return (double) maxSum/k;
    }
	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
        System.out.println(findMaxAverage(nums,k));
   }
}