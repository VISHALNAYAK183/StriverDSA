package Striver.Arrays;
import java.util.*;

// class Lead{
//     List<Integer> lead(int[] arr){

//         int val1 = 0, val2 = 1;
//         ArrayList<Integer> list = new ArrayList<>();

//         while(val1 < arr.length){

           
//             if(val1 == arr.length - 1){
//                 list.add(arr[val1]);
//                 break;
//             }

         
//             else if(val2 < arr.length && arr[val2] > arr[val1]){
//                 val1++;
//                 val2 = val1 + 1;
//             }

           
//             else if(val2 == arr.length){
//                 list.add(arr[val1]);
//                 val1++;
//                 val2 = val1 + 1;
//             }

       
//             else{
//                 val2++;
//             }
//         }
//         return list;
//     }
// }
class Lead{
    List<Integer>lead(int[] arr){
         ArrayList<Integer> list = new ArrayList<>();
         int Max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=Max){
                list.add(arr[i]);
                Max=arr[i];
            }
        }
        return list;
    }
}

public class Leaders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Lead obj = new Lead();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(obj.lead(arr));
    }
}
