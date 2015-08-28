package dsa.stack;

import java.util.Arrays;

/**
 * Created by szagoret on 8/28/2015.
 */
public class Main {
    public static void main(String[] args) {

        Stack<Integer> S = new ArrayStack<>(); // contents: ()
        S.push(5);                             // contents: (5)
        S.push(3);                             // contents: (5,3)
        System.out.println(S.size());          // contents: (5,3) outputs 2
        System.out.println(S.pop());           // contents: (5) outputs 3
        System.out.println(S.isEmpty());       // contents: (5,3) outputs false
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        S.push(7);
        S.push(9);
        System.out.println(S.top());
        S.push(4);
        System.out.println(S.size());
        System.out.println(S.pop());
        S.push(6);
        S.push(8);
        System.out.println(S.pop());


        // Tester routine for reversing arrays

        Integer[] a = {4, 8, 15, 16, 23, 42}; // autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        ReverseArray.reverse(a);
        ReverseArray.reverse(s);

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
    }
}
