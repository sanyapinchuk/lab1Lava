package main.java.by.sanya.task5;


public class Tester5 {
    public static void test(){
        var temp = new ArrayTask2(5);
        temp.showArray();
        System.out.printf("Deleted %d numbers\r\n", temp.arr.length - temp.getResult());
    }
}
