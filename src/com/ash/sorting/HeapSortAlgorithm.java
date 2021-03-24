package com.ash.sorting;

public class HeapSortAlgorithm {

    public static void main(String[] args){

        int[] arr={50,70,10,45,90,100,20};
        HeapSortAlgorithm hs=new HeapSortAlgorithm();
        hs.heapSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+",");
        }
        System.out.println();
    }

    public void heapSort(int[] arr){

        int len=arr.length;
        for (int i=(len/2)-1;i>=0;i--){
            heapify(arr,len,i);
        }
        for(int i=len-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }

    }

    private void heapify(int[] arr, int len, int i) {

        int largest=i;
        int leftChild=(2*i)+1;
        int rightChild=(2*i)+2;

        while(leftChild<len && arr[leftChild]>arr[largest])
            largest=leftChild;
        while (rightChild<len && arr[rightChild]>arr[largest])
            largest=rightChild;

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,len,largest);
        }
    }

}
