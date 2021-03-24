package com.ash.practicequestions;

import java.util.ArrayList;
import java.util.List;

public class AmazonPromotion {


    public static void main(String[] args){

        String[][] codeList={{"apple","apple",},{"banana","banana","anything","orange"}};
        String[] cart={"carrots","apple","apple","banana","banana","cherry","orange"};

        System.out.println(findWinner(codeList,cart));


    }


    public static int findWinner(String[][] codeList, String[] cart){

        List<String> newCodeList=new ArrayList<>();
        for(int i=0;i<codeList.length;i++){
            String[] l=codeList[i];
            for(int j=0;j<l.length;j++){
                newCodeList.add(l[j]);
            }
        }

        System.out.println(newCodeList.size());

        int codeListPointer=0;
        int cartPointer=0;

        while (cartPointer<cart.length && codeListPointer<newCodeList.size()){
            if(cart[cartPointer].equalsIgnoreCase(newCodeList.get(codeListPointer)) ||
            newCodeList.get(codeListPointer).equalsIgnoreCase("anything")){
                codeListPointer++;
                cartPointer++;
            }
            else{
                cartPointer++;
                codeListPointer=0;
            }
        }
        return codeListPointer==newCodeList.size() ? 1:0;
    }


}
