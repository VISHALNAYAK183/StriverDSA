package Striver.Arrays;

import java.util.*;

class MoveZero {
    int[] movezero(int[] arr) {
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return arr;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}

public class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoveZero obj = new MoveZero();
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = obj.movezero(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
