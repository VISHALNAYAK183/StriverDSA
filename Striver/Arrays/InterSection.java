package Striver.Arrays;

import java.util.*;
// class Inter{
//     Set<Integer> inter(int[] arr1,int[] arr2){
//         HashSet<Integer>set=new HashSet<>();
//         HashSet<Integer>result=new HashSet<>();
//         for(int i=0;i<arr1.length;i++){
//            set.add(arr1[i]);
//         }
//         for(int j=0;j<arr2.length;j++){
//             if(set.contains(arr2[j])){
//                 result.add(arr2[j]);
//             }
//         }

//     return result;
//     }
// }


//If array is sorted

class Inter{
    List<Integer>inter(int[] arr1, int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                if(list.size()==0||list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
                }
                i++;
                j++;
            }else{
                if(arr1[i]>arr2[j]){
                    j++;
                }else{
                    i++;
                }
            }
        }
        return list;
    }

}
public class InterSection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size for first array");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter first array (sorted)");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter size for second array");
        int m = sc.nextInt();

        int[] arr2 = new int[m];
        System.out.println("Enter second array (sorted)");
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        Inter obj = new Inter();
        System.out.println(obj.inter(arr1, arr2));
    }
}
