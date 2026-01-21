package Striver.Arrays;

import java.util.Scanner;

class NUnique{
    int NUni(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}

public class NumberOfUnique {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        NUnique obj =new NUnique();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique:"+obj.NUni(arr));
    }
}
