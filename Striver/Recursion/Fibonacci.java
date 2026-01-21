package Striver.Recursion;


class Fibo{
    int Fibbb(int n){
        int last=0; int seclast=0;
        if(n<=1){
            return n;
        }
        last=Fibbb(n-1);
        seclast=Fibbb(n-2);
        return last+seclast;

    }
}
public class Fibonacci {
    public static void main(String[] args){
        Fibo obj=new Fibo();
        System.out.println(obj.Fibbb(7));
    }
}
