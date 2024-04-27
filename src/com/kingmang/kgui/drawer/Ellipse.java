package com.kingmang.kgui.drawer;

import processing.core.PApplet;

public class Ellipse implements KObject{
    private float x;
    private float y;
    private float width;
    private float height;
    private int fillColor;

    public Ellipse(float x, float y, float width, float height, int fillColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
    }

    public void draw(PApplet parent) {

    }

    @Override
    public void update(PApplet parent) {
        parent.fill(fillColor);
        parent.ellipse(x, y, width, height);
        draw(parent);
    }
}