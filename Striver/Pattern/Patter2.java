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
    }
}
public class Patter2 {
    public static void main(String[] args){
    Star obj=new Star();
    obj.printStar(4);
    }
}
