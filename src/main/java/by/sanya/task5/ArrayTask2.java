package main.java.by.sanya.task5;

public class ArrayTask2 {
    public int[] arr;
    boolean[] ExistIndexes;
    boolean[] saveIndexes;

    int lengthEndOfSeq = 0;

    public ArrayTask2(int N){
        arr = new int[N];
        ExistIndexes = new boolean[N];
        for (int i = 0; i < N; ++i){
            arr[i]= (int)Math.round(Math.random()*100);
            ExistIndexes[i] = true;
        }
    }

    public void showArray(){
        for (int curr: arr
             ) {
            System.out.printf(" %d", curr);
        }
        System.out.println();
    }

    private int getNextIndexOfEndSequence(int i){
        while(i< ExistIndexes.length && ExistIndexes[i]==false)
            ++i;
        if(i>= arr.length)
            i = 0;
        return i;
    }

    private int getCountOfEndSeq(){
        int count = 0;
        for (boolean curr:
                ExistIndexes) {
            if(curr)
                count++;
        }
        return count;
    }

    private boolean isEndSequence()
    {
        for (int i= 0; i< ExistIndexes.length-1; ++i)
        {
            if(arr[getNextIndexOfEndSequence(i)] > arr[getNextIndexOfEndSequence(i+1)] )
                return false;
        }
        return true;
    }

    private void showIndexes(){
        for (boolean bool: ExistIndexes
             ) {
            if(bool)
                System.out.printf(" 1");
            else {
                System.out.printf(" 0");
            }

        }
        System.out.println();
    }


    public int getResult(){
        for(int i= 0; i< arr.length; ++i){
            ExistIndexes[i] = false;
        }
        ExistIndexes[0]=true;
        nextAction(0);
        ExistIndexes = saveIndexes;
        //ShowIndexes();
        return lengthEndOfSeq;
    }

    private boolean isAllFalse(){
        for (boolean bool:
            ExistIndexes) {
            if(bool)
                return false;
        }
        return true;
    }

    private void nextAction(int current){
        //ShowIndexes();
        if(isEndSequence()){
            var temp = getCountOfEndSeq();
            if(temp>lengthEndOfSeq)
            {
                lengthEndOfSeq = temp;
                saveIndexes = ExistIndexes.clone();
            }

        }
        if(current+1<arr.length){
            ExistIndexes[current+1] = !ExistIndexes[current+1];
            if(isAllFalse())
                return;
            nextAction(current+1);
        }
        else
        {
            if(current-1>=0)
            while(ExistIndexes[current-1]== false)
            {
                if(current-1==0)
                    break;
                else
                    --current;
            }

            ExistIndexes[current-1] = false;
            nextAction(current-1);
        }
    }


}
