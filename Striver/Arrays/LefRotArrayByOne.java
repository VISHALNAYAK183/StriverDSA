package Striver.Arrays;

import java.util.Scanner;


class LeftRotate{
    int[] LeftRot(int[] arr){
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1]; 
    }
    arr[arr.length-1]=first;
      return arr;
}
} 
public class LefRotArrayByOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LeftRotate obj =new LeftRotate();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int[] result = obj.LeftRot(arr);

        System.out.print("LeftRotate: ");
        for (int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
