package edu.princeton.cs.exercises.analysisOfAlgorithms;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class TwoSum {


    // print distinct pairs (i, j) such that a[i] + a[j]  = 0
    public static void printAll(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] + a[j] == 0) {
                    StdOut.println(a[i] + " " + a[j]);
                }
            }
        }
    } 

    // return number of distinct pairs (i, j) such that a[i] + a[j] = 0
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] + a[j] == 0) {
                    count++;
                }
            }
        }
        return count;
    } 



    public static void main(String[] args){

        In in = new In("../algs4-data/1Mints.txt");
        int[] a = in.readAllInts();


        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println("TwoSum elapsed time = " + timer.elapsedTime());
        StdOut.println("TwoSum count = " + count );

        
    }
    
}
