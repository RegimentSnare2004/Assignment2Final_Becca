public class QuickSort implements SortingAlgorithm{
    public static int partition(int[] input, int start, int end){
        int midpoint = start + (end - start) / 2;
        int pivot = input[midpoint];

        int low = start;
        int high = end;

        boolean complete = false;
        while(!complete){
            while(input[low] < pivot){
                low = low + 1;
            }
            while(pivot < input[high]){
                high = high -1;
            }
            if(low >= high){
                complete = true;
            }
            else{
                int temp = input[low];
                input[low] = input[high];
                input[high] = temp;
                low++;
                high--;
            }
        }
        return high;
    }
    public int[] QuickSort(int[] input, int start, int end){
        if(end <= start){
            return input;
        }
        int high = partition(input,start,end);
        QuickSort(input,start,high);
        QuickSort(input,high+1,end);
        return input;
    }
    @Override
    public int[] sorty(int[] input) {
        return QuickSort(input, 0, input.length - 1);
    }
}
