package Striver.Recursion;
import java.util.*;

class Backtre{
    void backt(int i, int n){
        if(i<1){
            return;
        }
        backt(i-1,n);
        System.out.println(i);
    }
}

public class BackTracktoN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Backtre obj=new Backtre();
        int n=sc.nextInt();
        obj.backt(n,n);
    }
}
