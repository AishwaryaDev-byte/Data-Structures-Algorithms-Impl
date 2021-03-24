package com.ash.sorting;

public class CountingSort {

    public static void main(String[] args){

        int[] arr={3,2,1,3,4,8,9,10,9,8,10,1};
        CountingSort cs=new CountingSort();
        cs.sort(arr, 10);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+",");
        }
        System.out.println();
    }
    public void sort(int[] arr, int k){

        int[] count=new int[k+1];
        int[] sorted=new int[arr.length];

        for (int i = 0; i < count.length; ++i)
            count[i] = 0;

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=k;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i= arr.length-1;i>=0;i--){
            sorted[--count[arr[i]]]=arr[i];
        }
        for(int i=0;i<sorted.length;i++){
            arr[i]=sorted[i];
        }

    }



}
