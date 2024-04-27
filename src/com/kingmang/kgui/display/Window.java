package com.kingmang.kgui.display;


import com.kingmang.kgui.drawer.Ellipse;
import processing.core.PApplet;

import static com.kingmang.kgui.Main.mySketch;

public class Window extends PApplet{
    private int sizeX;
    private int sizeY;
    Ellipse ellipseObj;
    public Window(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void settings(){
        size(sizeX, sizeY);
    }

    public void setup(){
        ellipseObj = new Ellipse(100,100,50,50,255);
    }
    public void draw(){
        ellipseObj.update(mySketch);
    }

    public void mousePressed(){}

}
