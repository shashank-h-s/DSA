public class FindTheHeightestAltitude {
    static public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++){
            sum += gain[i];
            maxAlt = Math.max(maxAlt , sum);
        }
        return maxAlt;
    }
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        System.out.println(largestAltitude(gain));
    }
}
