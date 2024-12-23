import java.util.Arrays; 

public class maxNumberOfKSumPairs {
    static public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int res=0;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]>k){
                r--;
            }
            else if(nums[l]+nums[r]<k){
                l++;
            }
            else{
                res++;
                l++;
                r--;
            }
        }
        return res;
   }

   public static void main(String[] args) {
        int [] nums1 = {1,2,3,4};
        int k1 = 5;
        int [] nums2 = {3,1,3,4,3};
        int k2 = 6;
        System.out.println(maxOperations(nums1, k1));
        System.out.println(maxOperations(nums2, k2));
   }
}
