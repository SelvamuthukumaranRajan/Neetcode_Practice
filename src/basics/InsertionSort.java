package basics;

class InsertionSort {
    void insertionSort(int[] arr){
        for(int index=1; index<arr.length; index++){
            int currNum = arr[index];
            while(index>0 && currNum<arr[index-1]){
                arr[index] = arr[index-1];
                index--;
            }
            arr[index]=currNum;
        }
    }
}
