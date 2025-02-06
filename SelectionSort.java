public class SelectionSort implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input){
        for(int i = 0; i < input.length-1; i++){
            int lowest = i;
            for(int j = i +1; j < input.length; j++){
                if(input[j] < input[lowest]){
                    lowest = j;
                }
            }
            int temp = input[i];
            input[i] = input[lowest];
            input[lowest] = temp;
        }
        return input;
    }
}
