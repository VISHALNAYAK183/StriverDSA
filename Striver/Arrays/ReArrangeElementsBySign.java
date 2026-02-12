package Striver.Arrays;

import java.util.*;

// class ReArrange{
//     int[] rearrange(int[] arr){
//         int[] res=new int[arr.length];
//         int j=0; int k=1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>0){

//               res[j]=arr[i];
//                 j+=2;
//             }else{
//                  res[k]=arr[i];
//                 k+=2;
//             }
//         }
//         for(int m=0;m<res.length;m++){
//             arr[m]=res[m];
//         }
//         return arr;
//     }
// }

//Number of Positives !=Negatives

class ReArrange {
    int[] rearrange(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        if (positive.size() > negative.size()) {
            for (int i = 0; i < negative.size(); i++) {
                arr[2 * i] = positive.get(i);
                arr[2 * i + 1] = negative.get(i);
            }
            int index = negative.size() * 2;
            for (int i = negative.size(); i < positive.size(); i++) {
                arr[index] = positive.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < positive.size(); i++) {
                arr[2 * i] = negative.get(i);
                arr[2 * i + 1] = positive.get(i);
            }
            int index = positive.size() * 2;
            for (int i = positive.size(); i < negative.size(); i++) {
                arr[index] = negative.get(i);
                index++;
            }
        }
        return arr;
    }
}

public class ReArrangeElementsBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReArrange obj = new ReArrange();
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = obj.rearrange(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
