package com.kingmang.lazurite.display;

import com.kingmang.lazurite.drawer.CommandExecutor;
import processing.core.PApplet;

import static com.kingmang.lazurite.Main.input;


public class Window extends PApplet{
    private int sizeX;
    private int sizeY;

    public Window(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public void settings(){
        size(sizeX, sizeY);
    }

    public void draw(){

        CommandExecutor.executeCommand(input);
        //ellipse(mouseX, mouseY, 50, 50);

    }

    public void mousePressed(){
        //background(64);
    }

    public void drawRect(int x, int y, int w, int h){
        rect(x,y,w,h);
    }

    public void drawEllipse(int x, int y, int w, int h){
        ellipse(x,y,w,h);
    }
}
