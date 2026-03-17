package Striver.Arrays;
import java.util.*;

class Bounteos{
 void bounte(int[] arr,int k){
    ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count=k;
            int sum=0;
            int j=i;
            while(count>0){
               
                sum+=arr[j];
                count--;
                if(j==arr.length){
                    break;
                }
                j++;
            }
            if(j==arr.length){
                    break;
                }
            list.add(sum);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
 }
}
public class Accolite {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Bounteos obj= new Bounteos();
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        obj.bounte(arr,k);


    }
}
