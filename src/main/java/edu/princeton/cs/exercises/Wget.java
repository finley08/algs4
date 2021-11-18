package edu.princeton.cs.exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class Wget {


    public  static void wget(String url,String saveFilePath){
        In in = new In(url);
        String data = in.readAll();
        String filename =  saveFilePath + url.substring(url.lastIndexOf('/') + 1);
        Out out = new Out(filename);
        out.println(data);
        out.close();
    }

    public static void main(String[] args){
        String url = "https://introcs.cs.princeton.edu/java/data/codes.csv";
        String saveFilePath = "";
        wget(url,saveFilePath);
    }
    
}
