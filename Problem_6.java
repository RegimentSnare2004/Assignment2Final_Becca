import java.util.Arrays;

public class Problem_6 {
    public static void main(String[] args){
        int[] A = {10, 9, 3, -7, 9, 2, 5};
        System.out.println("Original Array: " + Arrays.toString(A));
        BubbleSort bubblesort = new BubbleSort();
        System.out.println("Bubble Sort: " + Arrays.toString(bubblesort.sorty(A)));
        InsertionSort insertionsort = new InsertionSort();
        System.out.println("Insertion Sort: " + Arrays.toString(insertionsort.sorty(A)));
        SelectionSort selectionsort= new SelectionSort();
        System.out.println("Selection Sort: " + Arrays.toString(selectionsort.sorty(A)));
        ShellSort shellsort = new ShellSort();
        System.out.println("Shell Sort: " + Arrays.toString(shellsort.sorty(A)));
        QuickSort quicksort = new QuickSort();
        quicksort.sorty(A);
        System.out.println("Quick Sort: " + Arrays.toString(A));
       // int[] B = {5, 7, 19, 45, -8, 3, 0};
       // System.out.println("Unsorted: " + Arrays.toString(B));
        MergeSort mergesort = new MergeSort();
        mergesort.sorty(A);
        System.out.println("Merge Sort: " + Arrays.toString(A));
    }
}
