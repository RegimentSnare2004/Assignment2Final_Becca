import java.util.Random;
public class Tester {

    public SortingAlgorithm algorithm;
    public Tester(SortingAlgorithm sa){
        algorithm = sa;

    }

    public double singleTest(int size){
        int[] A = new int[size];
        Random random = new Random();
        for(int i = 0; i < A.length; i++){
            A[i] = random.nextInt();
        }
        double start_time = System.nanoTime();
        algorithm.sorty(A);
        double end_time = System.nanoTime();
        return (end_time - start_time)*0.000001;
    }
    public double singleTestk(int size){
        int[] A = new int[size];
        Random random = new Random();
        for(int i = 0; i < A.length; i++){
            A[i] = random.nextInt();
        }
        A = Problem11.generateKsorted(A);
        double start_time = System.nanoTime();
        algorithm.sorty(A);
        double end_time = System.nanoTime();
        return (end_time - start_time)*0.000001;
    }

    public void test(int iterations, int size){
        int i = 0;
        double avgTime = 0;
        while(i < iterations){
            singleTest(size);
            avgTime += singleTest(size);
            i++;
        }
        System.out.print(avgTime/iterations);
    }
    public void testK_sort(int iterations, int size){
        int i = 0;
        double avgTime = 0;
        while(i < iterations){
            singleTestk(size);
            avgTime += singleTestk(size);
            i++;
        }
        System.out.print(avgTime/iterations);
    }
}
