package edu.princeton.cs.exercises;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import edu.princeton.cs.algs4.In;

public class BinarySearch {

    public static int rank(int key ,int[] a){
        int low = 0;
        int hi = a.length-1;

        for(int i=0 ;i<a.length-1;i++){
            int mid = (low+hi)/2;
            if(key<a[mid]){
                hi= mid -1;
            }else if(key>a[mid]){
                low = mid+1;
            }else{
                return mid;
            }

        }

        return -1;
    
    }

    public static int binarySearch(int key,int[] whitelist){
        return rank(key, whitelist);
    }

    public static int forCycleSearch(int key,int[] whitelist){

        for(int i = 0 ; i<whitelist.length-1; i++){
           // System.out.println("current -> " + whitelist[i]);
            if(key==whitelist[i]){
                return i;
            }
        }
        
        return -1;
    }


    public static String getCurrentTime(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss.SSSSSS");
        return simpleDateFormat.format(new Date());

    }
    public static void main(String[] args){

        int[] whitelist = In.readInts("../algs4-data/largeT.txt");
        Arrays.sort(whitelist);

        
        System.out.println("start binarySearch -> " + getCurrentTime());
        System.out.println("find index -> " + binarySearch(1000000,whitelist));
        System.out.println("end binarySearch -> " + getCurrentTime());

        System.out.println("\n");
       
        System.out.println("start forCycleSearch -> " + getCurrentTime());
        System.out.println("find index -> " + forCycleSearch(1000000,whitelist));
        System.out.println("end forCycleSearch -> " + getCurrentTime());

    
    }





    
}
