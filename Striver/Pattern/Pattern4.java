package Striver.Pattern;

class Star{
    void printStar(int n) {
         for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
         for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
       }
       for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
public class Pattern4 {
     public static void main(String[] args) {
        Star obj=new Star();
        obj.printStar(5);
    }
}
