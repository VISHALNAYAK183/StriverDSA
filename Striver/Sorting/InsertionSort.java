package Striver.Sorting;

import java.util.Scanner;

class Inser{
    void ISort(int[] arr,int n){
        for(int i=1 ;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
public class InsertionSort {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        Inser obj =new Inser();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.ISort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
}
