package Striver.Recursion;

class Pali{
    boolean pal(int i,String s,int n){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return pal(i+1,s,n);

    }
}
public class StringPalindrome {
    public static void main(String[] args){
        String s="MADAM";
        Pali obj=new Pali();
        int n=s.length();
        boolean result=obj.pal(0,s,n);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
