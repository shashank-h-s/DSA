import java.util.Arrays;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = { 4, 2, 1, 1, 2 };
        int extraCandies = 1;
        boolean[] res = new boolean[candies.length];
        int largestNumInArr = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (largestNumInArr < candies[i]) {
                largestNumInArr = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i] + extraCandies;
            if (temp >= largestNumInArr) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        // to print individual array elements
        // for(int i = 0 ; i < res.length ; i++) {
        // System.out.println(res[i]);
        // }
        System.out.println(Arrays.toString(res));
    }
}

// Example :

// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true]
// Explanation: If you give all extraCandies to:
// - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the
// kids.
// - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the
// kids.
// - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the
// kids.
// - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among
// the kids.
// - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the
// kids.