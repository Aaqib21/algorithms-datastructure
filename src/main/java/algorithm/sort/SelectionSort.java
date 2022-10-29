package algorithm.sort;


/*
PROCESS: Find the minimum entry in the list and swap with the first entry.
Then find the smallest in the remaining list and swap with second entry and continue so on.

TIME COMPLEXITY: (~ n^2 / 2)
    Running time insensitive to input : quadratic time even if input in sorted
    Data movement is minimal : linear number of swap (n)

USAGE: Not really used

 */
public class SelectionSort<T> {

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
