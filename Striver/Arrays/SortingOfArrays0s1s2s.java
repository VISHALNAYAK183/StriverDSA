package Striver.Arrays;

import java.util.*;

//Dutch national flag

class SrtArray {
    int[] srtarray(int[] arr) {
        int low=0; int high=arr.length-1; int mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        return arr;
    }
}

public class SortingOfArrays0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SrtArray obj = new SrtArray();
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = obj.srtarray(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
