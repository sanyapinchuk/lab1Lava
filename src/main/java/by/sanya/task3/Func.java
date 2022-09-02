package main.java.by.sanya.task3;

public class Func {
    private double a;
    private double b;
    private double h;

    public Func( double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h= h;
    }

    public void GetResult()
    {
        System.out.println("_______________________");
        System.out.println("|____X_____|_____Y____|");
        double curr = a;
        while(curr<=b)
        {
            System.out.printf("| %-8.2f | %-8.2f | \r\n", curr, Math.tan(curr));
            curr+= h;
        }
        System.out.println("________________________");
    }
}
