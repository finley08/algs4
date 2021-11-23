package edu.princeton.cs.exercises.sort;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Selection {

    public static void sort(Comparable[] a){

    }

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    
    private static void exch(Comparable[] a,int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void show(Comparable[] a){
        for(int i= 0 ; i<a.length ;i++){
            StdOut.print("a["+i+"]->"+a[i]);
        }
        StdOut.print();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 1 ; i<a.length ;i++){
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] whitelist = In.readInts("../algs4-data/largeT.txt");


    }

    
}
