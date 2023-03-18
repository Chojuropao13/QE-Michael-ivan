import java.util.HashSet;
import java.util.Set;

public class unique {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};
        int[] array3 = {3, 8};
        int[] array4 = {2, 8};

        int[] unique1 = findUniqueNumbers(array1, array2);
        int[] unique2 = findUniqueNumbers(array3, array4);

        System.out.print("zz: ");
        printArray(unique1);
        System.out.print("zz : ");
        printArray(unique2);
    }

    public static int[] findUniqueNumbers(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all elements of arr1 to set1
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        // Add all elements of arr2 to set2
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        // Remove common elements from set1
        set1.removeAll(set2);

        // Convert set1 to an array
        int[] unique = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            unique[index++] = num;
        }

        return unique;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
