package Striver.Arrays;
import java.util.*;

class Nis{
    int nis(int[] arr, int target){
        int i=0 ,j=target-1, count=0;
        while(i<arr.length && j<arr.length){
            count++;
            i++;
            j++;
        }
        return count;
    }
}
public class Nishanth {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Nis obj=new Nis();
        System.out.println("Enter Size of array:");
        int num=sc.nextInt();
        System.out.println("Neter aarrre");
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target");
        int target=sc.nextInt();
        System.out.println("Output"+obj.nis(arr,target));
    }
}
