package com.ash.practicequestions;

import java.util.ArrayList;

public class subArraySum {

    public static void main(String[] args){

        int[] arr={2,4,3,5,6,5,4,3,1,55,32,10,10,10,75};
        subArraySum obj=new subArraySum();
        ArrayList<Integer> res=obj.solution(arr,arr.length,85);
        System.out.println(res.get(0)+" "+res.get(1));

    }


    public ArrayList<Integer> solution(int[] arr,int n,int s){

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int add=0;
            int j=i;
            while(j<=n-1 && add<=s){
                add=add+arr[j];
                j++;
                if(add==s){

                    list.add(i);
                    list.add(j);

                    return list;
                }
            }
        }
        // Your code here
        return list;
    }
}
