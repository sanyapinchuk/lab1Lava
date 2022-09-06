package main.java.by.sanya.task8;

import java.util.Random;

public class ArrayTask4 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public int arrA[];
    public int arrB[];

    int N;
    int M;

    public void ShowArray(int arr[], String color)
    {
        System.out.println();
        for (int curr: arr
        ) {
            System.out.printf(" %s%d%s", color, curr, ANSI_RESET);
        }
        System.out.println();
    }

    private void InitArray(int arr[], int size){

        int temp;
        int last = 0;
        Random random = new Random();
        for (int i = 0; i<size; i++){
            do {
                temp = random.nextInt(50);
            } while(temp<last);
            last = temp;
            arr[i] = temp;
        }
    }

    public ArrayTask4(int N, int M){
        arrA = new int[N];
        arrB = new int[M];
        this.N = N;
        this.M = M;
        InitArray(arrA, N);
        InitArray(arrB, M);
    }

    public void GetResult(){
        int arrResult[] = new int[N+M];
        int kA =0;
        int kB = 0;
        ShowArray(arrA, ANSI_RED);
        ShowArray(arrB, ANSI_BLUE);
        System.out.println();

        for (int i = 0; i< N+M; i++){
            while(arrA[kA]<=arrB[kB]){
                arrResult[i] = arrA[kA];
                System.out.printf(ANSI_RED + arrResult[i] + ANSI_RESET+ " ");
                i++;
                kA++;
                if(kA == arrA.length){
                    for (int j = i; j< N+M; j++){
                        arrResult[j] = arrB[kB];
                        System.out.printf(ANSI_BLUE + arrResult[j] + ANSI_RESET+ " ");
                        kB++;

                    }
                    return;
                }
            }
            while(arrA[kA]>arrB[kB]){
                arrResult[i] = arrB[kB];
                System.out.printf(ANSI_BLUE + arrResult[i] + ANSI_RESET+ " ");
                i++;
                kB++;
                if(kB == arrA.length){
                    for (int j = i; j< N+M; j++){
                        arrResult[j] = arrA[kA];
                        System.out.printf(ANSI_RED + arrResult[i] + ANSI_RESET+ " ");
                        kA++;
                    }
                    return;
                }
            }
        }
    }
}
