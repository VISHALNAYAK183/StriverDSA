package Striver.Arrays;

import java.util.Scanner;

class LargeE{
    int LEle(int[] arr){
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       return max;
    }

}
public class LargestEleInArray {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        LargeE obj =new LargeE();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Large:"+obj.LEle(arr));
    }
}
