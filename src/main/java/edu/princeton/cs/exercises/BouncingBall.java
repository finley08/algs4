package edu.princeton.cs.exercises;

import edu.princeton.cs.algs4.StdDraw;

public class  BouncingBall {

    public static void main(String[] args) {

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy; 

            // update position
            rx = rx + vx; 
            ry = ry + vy; 

            // clear the background
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledSquare(0, 0, 1.0);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK); 
            StdDraw.filledCircle(rx, ry, radius); 

            // display and pause for 20 ms
            StdDraw.show();
            StdDraw.pause(20);
        } 
    } 
}
