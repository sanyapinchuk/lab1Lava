package main.java.by.sanya.task5;


public class Tester5 {
    public static void Test(){
        var temp = new ArrayTask2(5);
        temp.ShowArray();
        System.out.printf("Deleted %d numbers\r\n", temp.arr.length - temp.GetResult());
    }
}
