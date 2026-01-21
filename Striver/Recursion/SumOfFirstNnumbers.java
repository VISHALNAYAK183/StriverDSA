package Striver.Recursion;


class Sumof{
    void sumtotal(int n,int sum){
        
        if(n==0){
            System.out.println(sum);
            return;
        }
       
        sumtotal(n-1,sum+n);
    }
}
public class SumOfFirstNnumbers {
    public static void main(String[] args){
        Sumof obj=new Sumof();
        obj.sumtotal(4,0);
    }
}
