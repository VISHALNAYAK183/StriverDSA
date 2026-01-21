package Striver.Hashing;
import java.util.*;

class Freq{
    void calfreq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        Object[] keys=map.keySet().toArray();
        for(int i=0;i<keys.length;i++){
            int key=(int) keys[i];
            System.out.println(key +"->"+map.get(key));
        }
    }
}
public class CountFreq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Freq obj=new Freq();
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.calfreq(arr);
    }
}
