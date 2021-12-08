package edu.princeton.cs.exercises.analysisOfAlgorithms;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class TwoSumFast {

    // print distinct pairs (i, j) such that a[i] + a[j] = 0
    public static void printAll(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        for (int i = 0; i < n; i++) {
            int j = Arrays.binarySearch(a, -a[i]);
            if (j > i) StdOut.println(a[i] + " " + a[j]);
        }
    } 

     // returns true if the sorted array a[] contains any duplicated integers
     private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true;
        return false;
    }

    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = Arrays.binarySearch(a, -a[i]);
            if (j > i) count++;
        }
        return count;
    } 

    public static void main(String[] args){

        In in = new In("../algs4-data/1Mints.txt");
        int[] a = in.readAllInts();


        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println("TwoSumFast elapsed time = " + timer.elapsedTime());
        StdOut.println("TwoSumFast count = " + count );

        
    }

    
}
