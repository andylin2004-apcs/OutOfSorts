import java.util.*;

public class Tester{
  public static void main(String[] args) {
    Random rng = new Random();

    int[] testCase = new int[rng.nextInt() % 1000];

    // rng = new Random(100);
    for (int i = 0; i<testCase.length; i++){
      testCase[i] = rng.nextInt() % 1000;
    }

    System.out.println(Arrays.toString(testCase));

    Sorts.bubbleSort(testCase);
  }
}
