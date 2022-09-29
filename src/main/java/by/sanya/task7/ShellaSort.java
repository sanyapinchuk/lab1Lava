package main.java.by.sanya.task7;

public class ShellaSort {
    int[] arr;
    int size;
    public ShellaSort(int n ){
        arr = new int[n];
        size = n;
        for (int i = 0; i < n; i++){
            arr[i] = Math.round((float)(Math.random()*100));
        }
    }

    private void swap(int i, int j){
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

    public void sort(){
        int i = 0;
        while(i<size-1){
            if(arr[i]>arr[i+1])
            {
                swap(i,i+1);
                if(i!=0)
                    i--;

            }
            else
            {
                i++;
            }

        }
    }

    public void showArray(){
        if(arr != null){
            for (int j =0; j< size; j++){
                System.out.printf(" %d", arr[j]);
            }
            System.out.println();
        }

    }

}
