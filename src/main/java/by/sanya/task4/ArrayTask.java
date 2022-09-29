package main.java.by.sanya.task4;

import java.math.BigInteger;

public class ArrayTask {
    int[] arr;

    public ArrayTask(int N){
        arr = new int[N];
        for (int i = 0; i < N; ++i){
            arr[i]= (int)Math.round(Math.random()*100);
        }
        
    }

    public void getResult (){
        for (int i =0; i< arr.length; i++) {
            BigInteger bigInt = BigInteger.valueOf(arr[i]);
            boolean isPrime = bigInt.isProbablePrime((int) Math.log(arr[i]));
            if(isPrime)
                System.out.printf("arr[%d] = %d \r\n", i,  arr[i] );

        }
    }

}
