package Striver.Pattern;
// class Star1{
//     void stary(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//          for(int i=n;i>0;i--){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// class Star1{
//     void stary(int n){
//         boolean check=true;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 if(check){
//                 System.out.print("1");
//                 check=false;
//                 }else{
//                    System.out.print("0"); 
//                    check=true;
//                 }
//             }
//             System.out.println();
//         }
       
//     }
// }

// class Star1{
//     void stary(int n){
//         for(int i=1;i<n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//           for(int j=1;j<=2*(n-i);j++) {
//             System.out.print(" ");
//           }
//              for(int j=i;j>0;j--){
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }

//     }
// }

class Star1{
    void stary(int n){
        
       for( int i=0;i<n;i++){
         char ch = 'A';
        for(int j=0;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println(" ");
       }

    }
}
public class Pattern5 {
    public static void main(String[] args) {
    Star1 obj=new Star1();
    obj.stary(5);
    }
}
