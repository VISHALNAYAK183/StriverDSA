package Striver.Arrays;
import java.util.*;

class LineSe{
    int lines(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LineSe obj=new LineSe();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(obj.lines(arr,target));
    }
}
