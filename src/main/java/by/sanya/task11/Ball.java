package main.java.by.sanya.task11;

import java.awt.*;

public class Ball {
    private int weight;
    private Color color;
    public Ball(int weight, Color color){
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public Color getColor(){
        return color;
    }
}
