package Striver.BasicMAths;

import java.util.*;

class Divi{
    public int[] divisor(int n){
    //     ArrayList<Integer> result=new ArrayList<>();
    //     int i=1;
    //     while(i<=n){
    //         if(n%i==0){
    //             result.add(i);
    //             i++;
    //         }
    //         i++;
    //     }
    //   int[] arr = new int[result.size()];
    //     for (int j = 0; j < result.size(); j++) {
    //         arr[j] = result.get(j);
    //     }

    //     return arr;


    //For  O(1)
 ArrayList<Integer> result=new ArrayList<>();
    for(int i=1;i*i<=n;i++){
        if(n%i==0){
            result.add(i);
            if(n/i!=i){
            result.add(n/i);
        }
        }
        
    }
    Collections.sort(result);
    int[] arr = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            arr[j] = result.get(j);
        }

        return arr;
    }
}
public class printalldivisors {
    public static void main(String[] args){
        Divi obj=new Divi();
           int[] divisors = obj.divisor(36);
       for(int i=0;i<divisors.length;i++){
        System.out.println(divisors[i]);
       }
    }
}
