package edu.princeton.cs.exercises.sort;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {

    public static double time(String alg, Comparable[] a){
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg,int N ,int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for(int t=0;t<T;t++){
           for(int i = 0; i<N;i++){
               a[i] = StdRandom.uniform();
           }
           total += time(alg, a);
        }
        double avgTotal = total/T;
        return avgTotal;
    }

    public static void main(String[] args){
        int N = 100000;
        int T = 10;
        Double insertionTime = timeRandomInput("Insertion", N, T);
        Double selectionTime = timeRandomInput("Selection", N, T);
        StdOut.printf("%s cost time %f \n","Insertion",insertionTime);
        StdOut.printf("%s cost time %f \n","Selection",selectionTime);


    }

}
