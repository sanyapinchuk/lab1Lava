package main.java.by.sanya.task11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Tester11 {
    public static void test(){
        var balls = new ArrayList<Ball>();
        var random = new Random();
        Color[] colors = { Color.BLUE, Color.GREEN, Color.RED};
        for (int i =0; i< 15; ++i){
            balls.add(new Ball(
                    random.nextInt(5),
                    colors[random.nextInt(colors.length)]
            ));
        }
        var basket = new Basket(balls);
        System.out.println("Total weight: "+  BasketInteraction.getBasketWeight(basket));
        System.out.printf("Count balls with blue color: "+ BasketInteraction.getCountBallsWithColor(basket,Color.BLUE));
    }

}
