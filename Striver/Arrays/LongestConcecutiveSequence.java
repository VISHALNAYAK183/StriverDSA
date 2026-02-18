package Striver.Arrays;

import java.util.*;

// class LongConce{
//     int longconce(int[] arr){
//         int Maxcount=0;
//         for(int i=0;i<arr.length;i++){
//             int conce=arr[i];
//             int count=1;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[j]==conce+1){
//                     count++;
//                     conce=arr[j];
//                     j=-1;
//                 }
//             }
//             Maxcount=Math.max(count,Maxcount);
//         }
//         return Maxcount;
//     }
// }

//Bettr

// class LongConce{
//     int longconce(int[] arr){
//         Arrays.sort(arr);
//         int MaxCount=1;
//         int lastSmallest=arr[0];
//         int curmax=1;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]==lastSmallest+1){
//                 curmax++;
//                 lastSmallest=arr[i];
               
//             }else if(arr[i]==lastSmallest){
//                   continue;
            
//             }else{
//                  curmax = 1;
//                 lastSmallest = arr[i];
//             }
//             MaxCount = Math.max(curmax, MaxCount);
//         }
//         return MaxCount;
//     }
// }

//Optimal

class LongConce{
     int longconce(int[] arr){

        if(arr.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

       
        for(int num : arr){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){

           
            if(!set.contains(num - 1)){

                int current = num;
                int count = 1;

              
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
public class LongestConcecutiveSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LongConce obj = new LongConce();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(obj.longconce(arr));
    }
}
