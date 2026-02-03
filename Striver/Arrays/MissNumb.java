package Striver.Arrays;
import java.util.*;

class MissNumber{
    int missnum(int[] arr,int num){
        int[] res=new int[num+1];
        for(int i=0;i<arr.length;i++){
            res[arr[i]]=1;
        }
       for(int i=1;i<res.length;i++){
        if(res[i]==0){
            return i;
        }
       }
       return -1;
    }
}

public class MissNumb {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MissNumber obj=new MissNumber();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(obj.missnum(arr,num));
    }
}
