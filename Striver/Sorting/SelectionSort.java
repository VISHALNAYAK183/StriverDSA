package Striver.Sorting;
import java.util.*;
class Sels{
    void selection(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        
    }
}
public class SelectionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       Sels obj=new Sels();
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
       }
       obj.selection(arr,n);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]);
       }
    }
}
