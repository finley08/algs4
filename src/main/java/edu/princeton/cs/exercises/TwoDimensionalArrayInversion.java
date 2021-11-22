package edu.princeton.cs.exercises;

public class TwoDimensionalArrayInversion {

    public static void main(String[] args){
        int[][] ora = {{1,2},{3,4}};
        int[][] fina = new int[2][2];

        for(int i= 0;i<ora.length;i++){
            for(int j=0;j<ora[i].length;j++){
                fina[i][j]= ora[j][i];
                System.out.print("ora->" + ora[i][j] +"\n");

            }
        }

        for(int i= 0;i<fina.length;i++){
            for(int j=0;j<fina[i].length;j++){
                System.out.print("fina->" + fina[i][j] +"\n");
            }
        }



    }
    
}
