package Striver.Arrays;
import java.util.*;

// class SubArr{
//     int subarr(int[] arr,int k){
//         int left=0; int right=0;
//         int count=0; int sum=0;
//         while(right<arr.length){
//             sum+=arr[right];
//             while(sum>k){
//                 sum-=arr[left];
//                 left++;
//             }
//             if(sum==k){
//                 count++;
//             }
//             right++;
//         }
// return count;
//     }
// }

class SubArr{
    int subarr(int[] arr, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
         map.put(0, 1);
        int count=0;int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
           map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
public class CountSubArraySumsEqualK {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         SubArr obj=new SubArr();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
          System.out.println("Enter K");
          int k=sc.nextInt();
        System.out.println(obj.subarr(arr,k));
    }
}
