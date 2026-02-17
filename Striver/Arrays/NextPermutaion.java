package Striver.Arrays;
import java.util.*;

class NextPer{
    int[] nextper(int[] arr){
        int index=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            return arr;
            
        }
        for(int i=arr.length-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                break;
            }
        }
            int start=index+1;;
            int end=arr.length-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            return arr;
    }
}
public class NextPermutaion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        NextPer obj = new NextPer();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = obj.nextper(arr);
        System.out.println(Arrays.toString(result));
    }
}
