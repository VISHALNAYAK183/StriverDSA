package Striver.Sorting;
import java.util.*;

class Buble{
    void BSort(int[] arr,int n){
        for(int i=n-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
            System.out.println("Run");
        }
    }
}
public class BubleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Buble obj =new Buble();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.BSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
}
