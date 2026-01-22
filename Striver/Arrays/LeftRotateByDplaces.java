package Striver.Arrays;

import java.util.Scanner;

// class LeftRotateByD{
//     int[] LeftRotByD(int[] arr,int k,int n){
//          k=k%n;
//         if(k==0){
//             return arr;
//         }
//         int first=arr[0];
//         for(int i=0;i<arr.length-1;i++){
//                 arr[i]=arr[i+1]; 
//     }
//     arr[arr.length-1]=first;
   
//        return LeftRotByD(arr, k-1,n);

//     }
// }

//Optimal
class LeftRotateByD {

    void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    int[] LeftRotByD(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }
}

public class LeftRotateByDplaces {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LeftRotateByD obj =new LeftRotateByD();
        int n=sc.nextInt();
        System.out.println("Enter Key: ");
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int[] result = obj.LeftRotByD(arr,k);
        System.out.print("LeftRotate: ");
        for (int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
