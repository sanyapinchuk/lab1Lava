package main.java.by.sanya.task6;

import main.java.by.sanya.task4.ArrayTask;

public class ArrayTask3 {
    int[] initArr;

    int[][] resultArr;

    int size;

    public ArrayTask3(int n){
        initArr = new int[n];
        size = n;
        for (int i = 0; i < n; i++){
            //initArr[i] = Math.round((float)(Math.random()*100));
            initArr[i] = i+1;
        }
    }

    public void createArray(){
        resultArr = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size-i; j++){
                resultArr[i][j] = initArr[j+i];
            }
            int k = 0;
            for (int j = size-i; j < size; j++, k++){
                resultArr[i][j] = initArr[k];
            }
        }
    }
    public void showArray(){
        if(resultArr!= null){
            for (int i =0; i< size; i++){
                for (int j =0; j< size; j++){
                    System.out.printf(" %d", resultArr[i][j]);
                }
                System.out.println();
            }
        }

    }
}
