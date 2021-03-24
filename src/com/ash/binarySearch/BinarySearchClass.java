package com.ash.binarySearch;

import java.util.Scanner;

public class BinarySearchClass {

    public int binarySeach(int[] arr, int element){

        int l=0;
        int r=arr.length;

        while(l<=r){
            int m=l+(r-1)/2;
            if(arr[m]==element)
                return m;
            else if(element<arr[m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr={2,4,5,7,9,10};
        BinarySearchClass bs=new BinarySearchClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to search:");
        int element=sc.nextInt();
        int index=bs.binarySeach(arr,element);
        System.out.println(index);

    }


}
