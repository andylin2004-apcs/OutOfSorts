import java.util.Arrays;

public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    Boolean sorted = false;
    for (int v = 0; v<data.length; v++){
      for (int i = 1; i<data.length-v; i++){
        if (data[i-1] > data[i]){
          int temp = data[i];
          data[i] = data[i-1];
          data[i-1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(data));
  }
}
