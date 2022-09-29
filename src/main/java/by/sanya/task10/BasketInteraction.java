package main.java.by.sanya.task10;

import java.awt.*;

public class BasketInteraction {
    public static int getBasketWeight(Basket basket){
        basketNullValidation(basket);
        var balls = basket.getBalls();
        int result =0;
        for (Ball ball : balls) {
            result += ball.getWeight();
        }
        return result;
    }
    public static int getCountBallsWithColor(Basket basket, Color color){
        basketNullValidation(basket);
        var balls = basket.getBalls();
        int result =0;
        for (Ball ball : balls) {
            if (ball.getColor() == color)
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
