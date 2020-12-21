import java.util.Arrays;

public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int v = 0; v<data.length; v++){
      for (int i = 1; i<data.length-v; i++){
        if (data[i-1] > data[i]){
          int temp = data[i];
          data[i] = data[i-1];
          data[i-1] = temp;
        }
      }
    }
  }

  public static void selectionSort(int[] data){
    for (int i = 0; i<data.length; i++){
      int min = i;
      for (int v = i+1; v<data.length; v++){
        if (data[v] < data[min]){
          min = v;
        }
      }
      int temp = data[i];
      data[i] = data[min];
      data[min] = temp;
    }
  }

  public static void insertionSort(int[] data){
    for(int i = 1; i<data.length; i++){
      if (data[i] < data[i-1]){
        int move = data[i];
        int v = i - 1;
        while(v>=0 && data[v] > move){
          data[v+1] = data[v];
          v--;
        }
        data[v+1] = move;
      }
    }
  }

}
