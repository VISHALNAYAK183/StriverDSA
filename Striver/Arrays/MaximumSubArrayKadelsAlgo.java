package Striver.Arrays;

import java.util.*;

// class MaxArr{
//     int majarr(int[] arr){
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             int sum=0;
//             for(int j=i;j<arr.length;j++){
//                 sum+=arr[j];
//                 max=Math.max(sum,max);

//             }
//         }
//         return max;
//     }
// }

//kadanes Algor
class MaxArr{
    int majarr(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        if (arr.length == 0) return 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}   
public class MaximumSubArrayKadelsAlgo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MaxArr obj=new MaxArr();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.majarr(arr));
    }
}
