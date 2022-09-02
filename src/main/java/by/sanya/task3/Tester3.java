package main.java.by.sanya.task3;

import java.util.Scanner;
import main.java.by.sanya.task3.Func;

public class Tester3 {
    public static void Test(){
        double a,b,h;
        System.out.print("Enter a:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();

        System.out.print("Enter b:");
        b = in.nextDouble();

        System.out.print("Enter h:");
        h = in.nextDouble();

        var func = new Func(a,b,h);
        func.GetResult();

    }
}
