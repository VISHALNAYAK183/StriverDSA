package Striver.Arrays;

import java.util.*;

class Stock{
    int stock(int[] arr){
        int res=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<minprice){
            minprice=arr[i];
           }else if(arr[i]-minprice>res){
            res=arr[i]-minprice;
           }
        }
        return res;
        
    }
}
public class StockBuySell {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stock obj=new Stock();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.stock(arr));
    }
}
