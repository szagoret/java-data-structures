package dsa.fundamental.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author szagoret
 */
public class ArrayRandomTest {

    public static void main(String[] args) {
        int[] data = new int[10];
        Random random = new Random(); // a pseudo-random number generator
        random.setSeed(System.currentTimeMillis()); // use currnet time as a seed
        // fill the data array with pseudo-random numbers from 0 to 99, inclusive
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100); // the next pseudo-random number
            int[] original = Arrays.copyOf(data, data.length); // make a copy of the data array
            System.out.println("Arrays equal after sort: " + Arrays.equals(data, original));
            Arrays.sort(data);
            System.out.println("Arrays equal after sort: " + Arrays.equals(data, original));
            System.out.println("orig = " + Arrays.toString(original));
            System.out.println("data = " + Arrays.toString(data));
        }
    }
}
