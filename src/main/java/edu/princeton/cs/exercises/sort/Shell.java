package edu.princeton.cs.exercises.sort;

import edu.princeton.cs.algs4.StdOut;

public class Shell {

    public static void sort(Comparable[] a){
        //将a[] 按升序排列
        int N = a.length;
        int h =1;
        while(h<N/3){
            h = 3*h +1;//1,4,13,40...
        }

        //show(a);
        while(h >=1){
             //System.out.println("current h ->"+h);
            //将数组变为h有序
            for(int i=h; i<N;i++){
                show(a);
                for(int j=i; j>=h&&less(a[j], a[j-h]);j=j-h){
                    exch(a, j, j-h);
                }
                
            }
            h = h/3;
            
        }
        //show(a);


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
        String[] ora = {"S","O","T","E","A","D"};
        sort(ora);
    }
    
}
