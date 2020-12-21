import java.util.*;

public class Tester{
  public static void main(String[] args) {
    Random rng = new Random();

//rng.nextInt() % 100000
    int[] testCase = new int[Math.abs(10)];
    int[] testCaseResult = new int[testCase.length];
    int[] testCaseResult2 = new int[testCase.length];
    int[] testCaseResult3 = new int[testCase.length];

    // rng = new Random(100);
    for (int i = 0; i<testCase.length; i++){
      testCase[i] = rng.nextInt() % 1000;
      testCaseResult[i] = testCase[i];
      testCaseResult2[i] = testCase[i];
      testCaseResult3[i] = testCase[i];
    }

    Sorts.bubbleSort(testCaseResult);
    Sorts.selectionSort(testCaseResult2);
    Sorts.insertionSort(testCaseResult3);


    System.out.println(Arrays.toString(testCaseResult));
    System.out.println(Arrays.toString(testCaseResult2));
    System.out.println(Arrays.toString(testCaseResult3));

    Arrays.sort(testCase);

    System.out.println(Arrays.toString(testCase).equals(Arrays.toString(testCaseResult)));
    System.out.println(Arrays.toString(testCase).equals(Arrays.toString(testCaseResult2)));
    System.out.println(Arrays.toString(testCase).equals(Arrays.toString(testCaseResult3)));

  }
}
