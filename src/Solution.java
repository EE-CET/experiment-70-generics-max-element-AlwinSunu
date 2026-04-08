import java.util.Scanner;

public class Solution {

    // Generic method to find the maximum in an array
    // T extends Comparable<T> ensures the elements can be compared
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0]; // Assume first element is max
        for (int i = 1; i < array.length; i++) {
            // compareTo returns > 0 if the current element is greater than max
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Handle Integer Array
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            Integer[] intArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = sc.nextInt();
            }
            System.out.println("Max Integer: " + findMax(intArray));
        }

        // 2. Handle String Array
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            String[] strArray = new String[m];
            for (int i = 0; i < m; i++) {
                strArray[i] = sc.next();
            }
            System.out.println("Max String: " + findMax(strArray));
        }

        sc.close();
    }
}
