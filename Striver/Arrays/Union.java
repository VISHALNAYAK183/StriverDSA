package Striver.Arrays;
import java.util.*;

class Uni {

    List<Integer> uni(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {

                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;

            } else {

                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        // remaining arr1
        while (i < arr1.length) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        // remaining arr2
        while (j < arr2.length) {
            if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }
}

public class Union {
    public static void main(String[] args) {

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

        Uni obj = new Uni();
        System.out.println(obj.uni(arr1, arr2));
    }
}