package Striver.Arrays;
import java.util.*;

// class Pascal{
//     int pascal(int row,int col){
       
//         int result=1;
       
//         for(int i=0;i<col;i++){
//                result=result*(row-i);
//                result=result/(i+1);
//         }
//         return result;
//     }

// }

// public class Pascaltriangle {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Pascal obj=new Pascal();
//         int row=sc.nextInt();
//         int col=sc.nextInt();
//         System.out.println(obj.pascal(row,col));
//     }
// }

//2nd Type

// class Pascal{
//     void pascal(int row){
      
//         long value=1;
//         int num=row-1;
//         for(int i=0;i<row;i++){
//            System.out.println(value);
//            value=value*(num-i)/(i+1);
//         }
       
//     }
// }

// public class Pascaltriangle {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Pascal obj=new Pascal();
//         int row=sc.nextInt();
//         obj.pascal(row);
//     }
// }

class Pascal{
    void pascal(int rows){
      
       for(int i=0;i<rows;i++){
            long value=1;
       
        for(int j=0;j<=i;j++){
           System.out.print(value+" ");
           value=value*(i-j)/(j+1);
        }
          System.out.println();
    }
  
    }
}

public class Pascaltriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Pascal obj=new Pascal();
        int rows=sc.nextInt();
        obj.pascal(rows);
    }
}