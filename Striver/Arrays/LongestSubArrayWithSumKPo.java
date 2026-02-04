package Striver.Arrays;

import java.util.*;

// class LongSub {
//     int longarr(int[] arr, int k) {
//         int maxlen = 0;
//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             int count = 0;
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j];
//                 count++;

//                 if (sum == k) {
//                     if (count > maxlen) {
//                         maxlen = count;
//                     }
//                     break;
//                 } else if (sum > k) {
//                     break;
//                 }
//             }
//         }
//         return maxlen;
//     }
// }


//Usiung hashmap

// class LongSub{
//     int longarr(int[] arr,int k){
//         HashMap<Integer, Integer> map=new HashMap<>();
//         int presum=0;
//         int maxlen=0;
//         for(int i=0;i<arr.length;i++){
//             presum+=arr[i];
//             if(presum==k){
//                 maxlen=i+1;
//             }
//             if(map.containsKey(presum-k)){
//                 int len=i-map.get(presum-k);
//                 if(len>maxlen){
//                     maxlen=len;
//                 }
//             }
//            if (!map.containsKey(presum)) {
//                 map.put(presum, i);
//             }
//         }
//         return maxlen;
//     }
// }


//2 Pointer (optimal)
class LongSub{
    int longarr(int[] arr, int k){
        int left=0,right=0;
        int sum=0; int maxlen=0; 
       while(right<arr.length){
        sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                int len=right-left+1;
                if(len>maxlen){
                    maxlen=len;
                }
            }
            right++;
       }
       return maxlen;
    }
} 
public class LongestSubArrayWithSumKPo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LongSub obj = new LongSub();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K Value: ");
        int k = sc.nextInt();
        System.out.println("Large:" + obj.longarr(arr, k));
    }
}
