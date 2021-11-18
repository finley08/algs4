package edu.princeton.cs.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Sattolo {

    private Sattolo(){

    }

    public static void cycle(Object[] a){
        int n = a.length;
        for(int i=n; i>1;i--){
            int r = (int) (Math.random()*(i-1));
            StdOut.println("i->" + i);
            StdOut.println("i-1->" + (i-1));
            StdOut.println("r->" + r);
            Object swap = a[r];
            a[r] = a[i-1];
            a[i-1] = swap;
        }
       
    }

    public static void main(String[] args) {
        // read in the data
        String[] a = {"1","7","8","2","9"};
        System.out.println("before cycle->\n");
        for (int i = 0; i < a.length; i++)
        StdOut.println(a[i]);
        // shuffle the array
        Sattolo.cycle(a);
        System.out.println("after cycle->\n");
        // print results.
        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
}

    

