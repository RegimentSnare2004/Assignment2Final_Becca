public class Performance_Ksorted {
        public static void main(String[] args){
            int[] elements = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

            SortingAlgorithm algorithm1 = new BubbleSort();
            System.out.println("Sorting algorithm - Bubble sort");
            for(int i = 0; i < elements.length; i++){
                System.out.print("Sorted " + elements[i]+ " elements in ");
                new Tester(algorithm1).testK_sort(20,elements[i]);
                System.out.print(" ms (avg)");
                System.out.println();
            }
            SortingAlgorithm algorithm2 = new InsertionSort();
            System.out.println("Sorting algorithm - Insertion sort");
            for(int i = 0; i < elements.length; i++){
                System.out.print("Sorted " + elements[i]+ " elements in ");
                new Tester(algorithm2).testK_sort(20,elements[i]);
                System.out.print(" ms (avg)");
                System.out.println();
            }
            SortingAlgorithm algorithm3= new SelectionSort();
            System.out.println("Sorting algorithm - Selection sort");
            for(int i = 0; i < elements.length; i++){
                System.out.print("Sorted " + elements[i]+ " elements in ");
                new Tester(algorithm3).testK_sort(20,elements[i]);
                System.out.print(" ms (avg)");
                System.out.println();
            }

            SortingAlgorithm algorithm4 = new ShellSort();
            System.out.println("Sorting algorithm - Shell sort");
            for(int i = 0; i < elements.length; i++){
                System.out.print("Sorted " + elements[i]+ " elements in ");
                new Tester(algorithm4).testK_sort(20,elements[i]);
                System.out.print(" ms (avg)");
                System.out.println();
            }

            SortingAlgorithm algorithm5 = new QuickSort();
            System.out.println("Sorting algorithm - Quick sort");
            for(int i = 0; i < elements.length; i++){
                System.out.print("Sorted " + elements[i]+ " elements in ");
                new Tester(algorithm5).testK_sort(20,elements[i]);
                System.out.print(" ms (avg)");
                System.out.println();
            }

            SortingAlgorithm algorithm6 = new MergeSort();
            System.out.println("Sorting algorithm - Merge sort");
            for(int i = 0; i < elements.length; i++){
                System.out.print("Sorted " + elements[i]+ " elements in ");
                new Tester(algorithm6).testK_sort(20,elements[i]);
                System.out.print(" ms (avg)");
                System.out.println();
            }
        }
}
