package Striver.BasicMAths;


class digitcount{
   void countss(int n){
    int count=0;
    while(n>0){
        int lastdigit=n%10;
      
       count++;
        n=n/10;
    }
     System.out.println(count);
   }
}
public class CountDigit {
    public static void main(String[] args) {
       digitcount obj=new digitcount();
       obj.countss(9090); 
    }
}
