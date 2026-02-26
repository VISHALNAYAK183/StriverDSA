package Striver.Arrays;
import java.util.*;

class Major{
    void major(int[] arr){
        int size=arr.length/3;
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int value:map.keySet()){
            if(map.get(value)>size){
                list.add(value);
            }
        }
        for(int i=0;i<list.size();i++){

        System.out.println(list.get(i));
        }
    }
}

public class MajorityElement {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Major obj=new Major();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        obj.major(arr);
    }
}
