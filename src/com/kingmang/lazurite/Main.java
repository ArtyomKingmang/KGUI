package com.kingmang.lazurite;

import com.kingmang.lazurite.display.Window;
import processing.core.PApplet;

public class Main {
    public static String input;
    public static Window mySketch;
    public static void main(String[] args){

        input = "drawEllipse(100,100,50,50)";


        System.out.println(input);
        String[] processingArgs = {"Window"};
        mySketch = new Window(500,600);

        PApplet.runSketch(processingArgs, mySketch);
    }


}