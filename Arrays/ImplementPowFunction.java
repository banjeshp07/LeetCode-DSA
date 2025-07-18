package Arrays;


public class ImplementPowFunction {

    public static double myPow(double x, int n) {
        long N = n;  // Handle Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        while (N > 0) {
            if ((N % 2) == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 10;
    
        System.out.println(myPow(x, n));
    }
}

