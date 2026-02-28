package Striver.Arrays;
import java.util.*;

class MaxiOne{
    int maxione(int[] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
        }
        return max;
    }
}
public class MaxiContiOnes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MaxiOne obj=new MaxiOne();
        System.out.println("Enter sixze of aary:");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter array values:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output"+obj.maxione(arr));
    }
}
