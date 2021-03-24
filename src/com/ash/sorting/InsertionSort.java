package com.ash.sorting;

public class InsertionSort {

    public void insertionSorting(int[] arr){

        int l=arr.length;
        for(int i=1;i<l;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1]=key;
        }

    }

    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] arr={3,10,17,9,5};
        InsertionSort is=new InsertionSort();
        is.insertionSorting(arr);
        is.printArray(arr);

    }
}
