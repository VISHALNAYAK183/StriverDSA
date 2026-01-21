package Striver.Recursion;
import java.util.*;
class Arr{
    void revar(int i,int[] arr,int n){
       
        if(i>=n/2){
            return;
        }
         int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        revar(i+1,arr,n);
    }
}


public class ReverseArrayRecurion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Arr obj=new Arr();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.revar(0,arr,n);
         System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
