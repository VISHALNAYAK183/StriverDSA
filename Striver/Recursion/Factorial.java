package Striver.Recursion;
class Fact{
    int facto(int n){
        if(n==1){
            return 1;
        }else{
            return n*facto(n-1);
        }
    }
}

public class Factorial {
    public static void main(String[] args){
        Fact obj=new Fact();
        System.out.println(obj.facto(5));
    }
}
