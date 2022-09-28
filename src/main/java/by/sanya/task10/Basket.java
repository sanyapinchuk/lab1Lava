package main.java.by.sanya.task10;

import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket(){}
    public Basket(List<Ball> balls){
        this.balls= balls;
    }

    public List<Ball> get_Balls(){
        return balls;
    }
    public void set_Balls(List<Ball> balls){
        this.balls= balls;
    }
}
