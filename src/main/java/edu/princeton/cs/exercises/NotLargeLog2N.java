package edu.princeton.cs.exercises;

public class NotLargeLog2N {



    public static int lg(int n){
        int i = 1;
        int j= 0;
        while(true){
            i=i*2;
            j++;
            if(i>=n){
                return j;
            }
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<20;i++){
            int lg1 = lg(i);

            System.out.println("N:"+i+" log2N为-> " + lg1 );
        }
    }
    
}
