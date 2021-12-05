package edu.princeton.cs.exercises.sort;

import edu.princeton.cs.algs4.StdOut;

public class Insertion {

    public static void sort(Comparable[] a){
        // 将a[]升序排列
        int N = a.length;
        for(int i=1;i<N; i++){
            // 将 a[i] 插入到 a[i-1]􏲾a[i-2]􏲾a[i-3]...之中
            for(int j=i;j>0&&less(a[j], a[j-1]);j--){
                exch(a, j, j-1);
            }
            //show(a);
        }

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
            //StdOut.print("a["+i+"]->"+a[i] +" ");
            StdOut.print(a[i] +" ");
        }
        System.out.println("");
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
        String[] ora = {"S","O","T","E"};
        sort(ora);
    }

    
}
