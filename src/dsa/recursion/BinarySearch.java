package dsa.recursion;

import java.util.Arrays;

/**
 * Created by szagoret on 8/26/2015.
 */
public class BinarySearch {

    /**
     * Returns true if the target value is found in the indicated portion of the data array.
     * This search only considers the array portion from data[low] to data[high] inclusive.
     */
    public static int search(int[] data, int low, int high, int target) {

        if (low > high) {
            return -1;
        } else {
            int mid = (low + high) / 2;
            if (target == data[mid]) {
                return mid;
            } else if (target < data[mid]) {
                return search(data, low, mid - 1, target);
            } else {
                return search(data, mid + 1, high, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 8, 9, 20, 30};
        System.out.println("Search array is:" + Arrays.toString(array));
        System.out.println("Position of 20 is " + search(array, 0, 8, 20));
    }
}
