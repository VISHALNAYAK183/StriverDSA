package Striver.Arrays;

import java.util.Scanner;

class ArrSort{
    boolean ASort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
public class CheckArraySorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrSort obj =new ArrSort();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Large:"+obj.ASort(arr));
    }
}
