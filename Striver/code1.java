package Striver;

import java.util.*;

class Interview{
    void interview(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int val:map.keySet()){
            System.out.println(val +"   : " +map.get(val));
        }
    }
}

public class code1 {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        Interview obj=new Interview();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        obj.interview(arr);
    }
}
