package Striver.Arrays;

import java.util.Scanner;


class SLargeE{
    int SLEle(int[] arr){
        int largest=arr[0]; int seclargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
                
            }
        }
        return seclargest;
    }
}
public class SecLargeInArray {
     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        SLargeE obj =new SLargeE();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Large:"+obj.SLEle(arr));
    }
}
