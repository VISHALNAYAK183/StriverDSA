package Striver.Arrays;

import java.util.*;

// class MajEle{
//     int majele(int[] arr){
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);
//             }else{
//                 map.put(arr[i],1);
//             }
//         }
//         for(Map.Entry<Integer,Integer> e:map.entrySet()){
//             if(e.getValue()>arr.length/2){
//                 return e.getKey();
//             }
//         }
//         return -1;
//     }
// }

//Moores Voting algo

class MajEle{
    int majele(int[] arr){
        int cnt=0; int ele=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
               ele=arr[i];
                cnt=1;
            }else if(arr[i]==ele){
                cnt++;
            }else{
              
                cnt--;
            }
            
        }
       int cnt1=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==ele) cnt1++;
       }
       if(cnt1>arr.length/2) return ele;
       return -1;
    }
}
public class MajorityElementInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MajEle obj=new MajEle();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.majele(arr));
    }
}
