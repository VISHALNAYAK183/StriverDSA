package Striver.BasicMAths;


class Arm{
    
    boolean armstrong(int n){
        int result=0;
        int orig=n;
        while(n>0){
            int lastdigit=n%10;
            result+=lastdigit*lastdigit*lastdigit;
            n=n/10;
        }
        if(result==orig){
            return true;
        }else{
            return false;
        }
        
    }
    
}
public class Armstrong {
    public static void main(String[] args){
        Arm obj=new Arm();
       
        System.out.println( obj.armstrong(35));
    }
}
