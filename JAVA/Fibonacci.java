class Fibonacci {
    static void fibonacci(int n) {
        int first = 0;
        int second = 1;
        if (n == 1)
            System.out.println(first);
        else if (n == 2)
            System.out.println(first + " " + second);
        else {
            System.out.print(first + " " + second);
            for (int i = 3; i <= n; i++) {
                int sum = first + second;
                first = second;
                second = sum;
                System.out.print(" " + sum);
            }
        }
    }

    public static void main(String[] args) {
        fibonacci(5);
        // output is 0 1 1 2 3
    }
}