// class Math{
//   int a,b;
//     void calculate(int a, int b){
//         this.a=a;
//         this.b=b;
//         int c=a+b;
//         System.out.println(c);
//     }
// }
// class Math2 extends Math{
//     void multiply(int e ,int f){
//       int d= e*f;
//       System.out.println(d);
//     }
// }
// public class main{
//   public static void main(String[] args) {
//     Math2 obj =new Math2();
//     obj.calculate(10, 20);
//     obj.multiply(10, 20);
    
//   }
// }

// interface Math{
//     void calculate(int a, int b);   
// }
// interface Math2 {
//     void multiply(int e ,int f);
// }
//  class alci implements Math, Math2{
//     int a,b;
//     public void calculate(int a, int b){
//       int d=a+b;
//       System.out.println(d);
//     }
//     public void multiply(int a, int b){
//       int d=a*b;
//       System.out.println(d);
//     }
    
// }
// public class vishal{
//   public static void main(String[] args) {
    
//     alci obj =new alci();
//     obj.calculate(10, 20);
//     obj.multiply(10, 20);  
//   }
// }




class VK{
  void china(){
    System.out.println("Vishal");
  }

  static void usa(){
    VK ob=new VK();
    ob.china();
    System.out.println("America");
  }
}

public class vishal{
  public static void main(String[] args) {
    
    VK obj=new VK();
    obj.usa();

  }
}

