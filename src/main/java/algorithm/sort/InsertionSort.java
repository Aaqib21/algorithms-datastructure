package algorithm.sort;

/*
PROCESS: An insertion sort compares values in turn, starting with the second value in the list.
If this value is greater than the value to the left of it, no changes are made.
Otherwise, this value is repeatedly moved left until it meets a value that is less than it.
The sort process then starts again with the next value.

TIME COMPLEXITY:
    For random input:
      (~ n^2 / 4) -  compares(About twice as fast as SelectionSort)
      (~ n^2 / 4) -   swaps
    Best case: when array is already sorted
        (n-1) - compares
        (0)   - No swaps needed
    Worst case: when array is sorted in desc. it is slower than selection short as more swaps
        (~n^2/2) - compares
        (~n^2/2) - swaps

USAGE: very efficient for sorted or partially sorted arrays

 */
public class InsertionSort {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 5, 4, 2, 1, -1, -3, 5};
        String[] arrayString = {"abc", "def", "xyz", "pqr", "mno"};
        sort(array);
        sort(arrayString);
        System.out.println("Sorted: " + array);
        System.out.println("Sorted: " + arrayString);


    }

    private static void sort(Comparable[] item) {

    }
}
