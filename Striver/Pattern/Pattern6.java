package Striver.Pattern;
class Pattern{
    void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i!=0 && i!=n-1 && j!=0 && j!=n-1){
                    System.out.print(" ");
                }else{
                     System.out.print("*");
                }
               
            }
            System.out.println();
        }
    }
}
public class Pattern6 {
    public static void main(String[] args){
        Pattern obj=new Pattern();
        obj.pattern(4);
    }
}
