package main.java.by.sanya.task2;
import main.java.by.sanya.task2.Coordinates;
public class Tester2 {
    public static void test(){
        for (int i=0; i<25; i++){
            double x = Math.random()*8;
            double y = Math.random()*6;
            System.out.printf("x: %f | y: %f | Result: %b \r\n", x, y, Coordinates.getResult(x,y));
        }
    }
}
