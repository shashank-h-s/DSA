public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int nums[] = { 20, 100, 10, 12, 5, 13 };
        System.out.println(solution(nums));

    }

    private static boolean solution(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= max1)
                max1 = n;
            else if (n <= max2)
                max2 = n;
            else {
                return true;
            }
        }
        return false;

    }
}
