package com.ash.sorting;

public class SelectionSort {

    public void sort(int[] arr){

        int len=arr.length;
        for(int i=0;i<len-1;i++){
            //find the min value in the array
            int min=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

    }

    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");

        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={3,2,5,1,4,11,166};
        SelectionSort bs=new SelectionSort();
        bs.sort(arr);
        bs.printArray(arr);
    }

//Time complexity for slection sort is worse than insertion sort. O(n^2) in all cases regardless of the order of array.


}
