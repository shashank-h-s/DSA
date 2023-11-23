import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };

        int n = nums.length;
        int prev[] = new int[n];
        int suff[] = new int[n];
        prev[0] = 1;
        suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            prev[i] = prev[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = prev[i] * suff[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
