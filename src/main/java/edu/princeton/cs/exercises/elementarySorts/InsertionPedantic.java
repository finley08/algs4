package edu.princeton.cs.exercises.elementarySorts;

import java.util.Comparator;

import edu.princeton.cs.algs4.StdOut;

public class InsertionPedantic {

     // using natural order and Comparable interface
     public static <Key extends Comparable<Key>> void sort(Key[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++)
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }

    // using custom-order and Comparator interface
    public static <Key> void sort(Key[] a, Comparator<Key> comparator) {
        int n = a.length;
        for (int i = 1; i < n; i++)
            for (int j = i; j > 0 && less(comparator, a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }


    public static <Key extends Comparable<Key>> int[] indexSort(Key[] a) {
        int n = a.length;
        int[] index = new int[n];
        for (int i = 0; i < n; i++)
            index[i] = i;

        for (int i = 1; i < n; i++)
            for (int j = i; j > 0 && less(a[index[j]], a[index[j-1]]); j--)
                exch(index, j, j-1);

        return index;
    }




   /***************************************************************************
    *  Helper sorting functions.
    ***************************************************************************/
    
    // is v < w ?
    private static <Key extends Comparable<Key>> boolean less(Key v, Key w) {
        return v.compareTo(w) < 0;
    }

    // is v < w?
    private static <Key> boolean less(Comparator<Key> comparator, Key v, Key w) {
        return comparator.compare(v, w) < 0;
    }

    // no need for generics here
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private static <Key extends Comparable<Key>> boolean isSorted(Key[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    // Read strings from standard input, sort them, and print.
    public static void main(String[] args) {
        String[] a = {"S","O","T","E","A","D"};
        sort(a);
        show(a);
        assert isSorted(a);
    }

    
}
