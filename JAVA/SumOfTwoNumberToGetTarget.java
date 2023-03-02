public class SumOfTwoNumberToGetTarget {
    public static void main(String[] args) {
        int[] arr = { 11, 3, 7, 9, 14, 2 };
        int target = 17;
        getSumOfTwoNumber(arr, target);
    }

    static void getSumOfTwoNumber(int[] arr, int target) {
        int[] arr1 = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    arr1[0] = i;
                    arr1[1] = j;
                    break;
                }
            }
        }
        System.out.println(arr1[0] + "  " + arr1[1]);
    }
}
