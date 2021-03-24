package com.ash.sorting;

public class QuickSort {

    int pivot;


    public void printArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] arr=new int[]{3,10,17,9,5,11,0,1,6};
        QuickSort qs=new QuickSort();
        qs.quickSorting(arr,0,arr.length-1);
        qs.printArray(arr);

    }

    public void quickSorting(int[] arr,int lb,int ub){
        if(lb<ub){
            int part=partition(arr,lb,ub);

            quickSorting(arr,lb,part-1);
            quickSorting(arr,part+1,ub);
        }
    }

    private int partition(int[] arr, int lb, int ub) {
        pivot=arr[(lb+ub)/2];
        int start=lb;
        int end=ub;

        while(start<=end){
            while(arr[start]<pivot){

                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }


        return start;
    }



}
