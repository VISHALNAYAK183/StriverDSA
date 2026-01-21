package Striver.BasicMAths;

class RevNumber{
    void revnumber(int n){
        String num="";
        while(n>0){
            int lastdigit=n%10;
            num+=lastdigit;
            n=n/10;

        }
        System.out.println(num);
    }
}

public class reversenumber {
     public static void main(String[] args){
        RevNumber obj=new RevNumber();
        obj.revnumber(79);
     }
}
