package main.java.by.sanya.task9;

import java.awt.*;

public class BasketInteraction {
    public static int getBasketWeight(Basket basket){
        basketNullValidation(basket);
        var balls = basket.getBalls();
        int result =0;
        for(int i = 0; i<balls.size(); i++){
            result+= balls.get(i).getWeight();
        }
        return result;
    }
    public static int getCountBallsWithColor(Basket basket, Color color){
        basketNullValidation(basket);
        var balls = basket.getBalls();
        int result =0;
        for (int i= 0; i<balls.size(); i++){
            if(balls.get(i).getColor()==color)
                result++;
        }
        return result;
    }
    private static void basketNullValidation(Basket basket){
        if(basket == null)
            throw new NullPointerException("basket is null");
        if(basket.getBalls()==null)
            throw new NullPointerException("list balls is null");
    }
}
