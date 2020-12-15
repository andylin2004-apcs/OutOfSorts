import java.util.*;

public class Tester{
  public static void main(String[] args) {
    Random rng = new Random();

    int[] testCase = new int[Math.abs(rng.nextInt() % 1000)];
    int[] testCaseResult = new int[testCase.length];
    // rng = new Random(100);
    for (int i = 0; i<testCase.length; i++){
      testCase[i] = rng.nextInt() % 1000;
      testCaseResult[i] = testCase[i];
    }

    // System.out.println(Arrays.toString(testCase));

    Sorts.bubbleSort(testCaseResult);

    Arrays.sort(testCase);
    // System.out.println(Arrays.toString(testCase));

    System.out.println(Arrays.toString(testCase).equals(Arrays.toString(testCaseResult)));
  }
}
