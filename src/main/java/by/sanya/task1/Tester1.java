package main.java.by.sanya.task1;

public class Tester1 {
    public static void test(){
        for (int i = 0; i < 25; i++){

            var x = Math.random()*60;
            var y = Math.random()*60;
            var temp = new CountResult(x, y, true );
            System.out.printf("x: %f | y: %f | Result: %f \r\n", x, y, temp.сalculateTask());
        }
    }

}
