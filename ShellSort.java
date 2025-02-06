public class ShellSort implements SortingAlgorithm{
    public static void interleavedList(int[] input, int start, int gap){
        for(int i = start + gap; i < input.length; i += gap){
            int j = i;
            while(j - gap >= start && input[j] < input[j-gap]){
                int temp = input[j];
                input[j] = input[j-gap];
                input[j-gap] = temp;
                j -= gap;
            }
        }
    }
    @Override
    public int[] sorty(int[] input){
        int[] gapValues = {4, 2, 1};
        for(int i = 0; i < gapValues.length; i++){
            for(int j = 0; j < gapValues[i]; j++){
                interleavedList(input, i, gapValues[i]);
            }
        }
        return input;
    }
}
