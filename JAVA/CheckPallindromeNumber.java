public class CheckPallindromeNumber {

	static boolean pallindromeNumber(int num) {
		// checking pallindrome without converting into string
		if (num < 0)
			return false;
		int temp = num;
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		return num == rev;

	}

	public static void main(String[] args) {
		System.out.println(pallindromeNumber(1001));
	}
}
