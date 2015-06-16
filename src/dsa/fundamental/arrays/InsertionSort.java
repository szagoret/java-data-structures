package dsa.fundamental.arrays;

import java.util.Arrays;

/**
 *
 * @author szagoret
 */
public class InsertionSort {

    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {            // begin with second character
            char value = data[k];                  // time  to insert value=data[k]
            int j = k;                           //find correct index j for value
            while (j > 0 && data[j - 1] > value) { // this, data[j-1] must go after value
                data[j] = data[j - 1];           // slide data[j-1] rightward
                j--;                             // and consider previous j for value
            }
            data[j] = value;                       // this is the proper place for cur
        }
    }

    public static void main(String[] args) {
        String unorderedAlphabet = "bcdaehgf";
        char[] unsortedCharArray = unorderedAlphabet.toCharArray();
        System.out.println("Unordered alphabet: " + Arrays.toString(unsortedCharArray));
        insertionSort(unsortedCharArray);
        System.out.println("Ordered alphabet: " + Arrays.toString(unsortedCharArray));

        Integer[] a = new Integer[2];
        Arrays.fill(a, 0);
        System.out.println("a" + Arrays.toString(a));
    }
}
