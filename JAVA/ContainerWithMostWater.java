public class ContainerWithMostWater {
 
    static public int maxProfit(int[] prices) {
    	 int result = 0;
    	 int P2, P1,i=0,j=prices.length-1;
    	 while(i != j) {
    		 P1 =prices[i];
    		 P2 = prices[j];
    		 if(P2<P1) {
    			if(result<(P2 * (j-i))) {
    				result = P2 * (j-i);
    			}
    			 j--;
    		 }else {
    			 int temp = P1 *(j-i);
    			 if(result < (P1 *(j-i))) {
     				result = P1 *(j-i);
     			}
    			 i++;
    		 }
    	 }
         return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7 };
        System.out.println(maxProfit(arr));
        
    }

}