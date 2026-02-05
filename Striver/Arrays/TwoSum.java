package Striver.Arrays;
import java.util.*;

// class TwoSumfun{
//     String twosumfun(int[] arr,int k){
        
//         HashSet<Integer> map=new HashSet<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.contains(k-arr[i])){
//                 return "Yes";
//             }else{
//                 map.add(arr[i]);
//             }
//         }


//         return "No";
//     }
// }

//2Pointer 
// class TwoSumfun{
//     String twosumfun(int[] arr,int k){
//         Arrays.sort(arr);
//         int left=0;  int right=arr.length-1;
        
//         while(left<right){
//             if(arr[left]+arr[right]==k){
//                 return "yes";
//             }else if(arr[left]+arr[right]>k){
//                 right--;
//             }else{
//                 left++;
//             }

//         }
//         return "No";
//     }
// }


class TwoSumfun{
    int[] twosumfun(int[] arr,int k){
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(k-arr[i])){
                return new int[]{map.get(k-arr[i]),i};
            }else{
                map.put(arr[i],i);
            }
        }


         return new int[]{-1,-1};
    }
}
public class TwoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TwoSumfun obj=new TwoSumfun();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter K elemnt:");
        int k=sc.nextInt();
        System.out.println(obj.twosumfun(arr,k));
    }
}
