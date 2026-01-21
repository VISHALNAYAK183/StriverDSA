package Striver.BasicMAths;
class HCF{
    void checkhcf(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
            
        }
        if(a==0){
            System.out.println(b);
        }else{
             System.out.println(a);
        }
    }
}
public class GCD {
    public static void main(String[] args){
        HCF obj=new HCF();
        obj.checkhcf(9,12);
    }
}
