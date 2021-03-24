package com.ash.sorting;

public class MergeSort {


    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4, 11, 10,143};
        MergeSort ms=new MergeSort();
        ms.mergeSort(arr,0,arr.length-1);
        ms.printArray(arr);
    }

        public void mergeSort(int[] arr,int low, int high){
        if(low<high){

            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    private void merge(int[] array,int low, int mid, int high) {
        int[] temp=new int[10];
        for(int i=low;i<=high;i++){
            temp[i]=array[i];
        }
        int i=low;
        int j=mid+1;
        int k=low;
        while (i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                array[k]=temp[i];
                i++;
            }
            else{
                array[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            array[k]=temp[i];
            k++;
            i++;
        }
        while(j<=mid){
            array[k]=temp[j];
            k++;
            j++;
        }
    }
}
