package com.kingmang.kgui;

import com.kingmang.kgui.display.Window;
import com.kingmang.kgui.drawer.Ellipse;
import processing.core.PApplet;

public class Main {

    public static Window mySketch;
    public static void main(String[] args){

        String[] processingArgs = {"Window"};
        mySketch = new Window(500,600);

        PApplet.runSketch(processingArgs, mySketch);
    }


}