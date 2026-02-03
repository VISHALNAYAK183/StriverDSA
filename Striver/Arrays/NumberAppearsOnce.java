package Striver.Arrays;
import java.util.*;

// class AppearsOnce{
//     int appearonce(int[] arr) {
//         int xor = 0;
//         for (int i = 0; i < arr.length; i++) {
//             xor ^= arr[i];
//         }
//         return xor;
//     }
// }


class AppearsOnce{
    int appearonce(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}
public class NumberAppearsOnce {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AppearsOnce obj=new AppearsOnce();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.appearonce(arr));
        
    }
}
