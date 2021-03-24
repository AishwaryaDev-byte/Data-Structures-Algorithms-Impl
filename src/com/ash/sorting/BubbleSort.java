package com.ash.sorting;

public class BubbleSort {


    public void bubbleSorting(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+",");
        }
    }

    public static void main(String[] args){
        int[] arr={3,2,5,1,4};
        BubbleSort bs=new BubbleSort();
        bs.bubbleSorting(arr);
        bs.printArray(arr);
    }

}
