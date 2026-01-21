package Striver.Recursion;

class ontoN{
    public void check(int i,int n)
    {
    //    if(i>n){
    //     return; 
    //    }
    //    System.out.println(i);
    //    check(i+1,n);
    if(n<i){
        return;
    }
    System.out.println(n);
        check(i,n-1);
    }

}
public class OnetoN {
    public static void main(String[] args){
        ontoN obj =new ontoN();
       obj.check(1,5);
    }
}
