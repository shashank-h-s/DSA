public class BinarySearch {
    // return the index of the target number in given array
    // if it is not found then return -1
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 8, 9, 11, 22, 44, 55, 66, 77, 89, 99, 123 };
        int target = 89;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}