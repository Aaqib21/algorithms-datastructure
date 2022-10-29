package algorithm.problems;

/*
 * Find floor sqrt of a positive integer number
 *
 * e.g. sqrt(4) = 2 and sqrt(5) = 2
 * */
public class SquareRoot {
    public static void main(String[] args) {
        int x = 101;
        System.out.println("Floor square root of " + x + " is : " + sqrt(x));
    }
    private static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 0;
        int end = x / 2;
        int ans = 0;
        while (start <= end) {
            // taking mid as long as mid*mid could be a huge number
            long mid = (start + end) / 2;

            //if it is a whole sqrt
            if (mid * mid == x) return (int) mid;

            if (mid * mid > x) {
                end = (int) mid - 1;

            } else {
                start = (int) mid + 1;
                ans = (int) mid;
            }

        }
        return ans;
    }
}
