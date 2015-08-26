package dsa.recursion;

/**
 * Created by szagoret on 8/25/2015.
 */
public class Factorial {

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("argument must be non negative");
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(20));
    }

}
