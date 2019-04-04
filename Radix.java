import java.util.*;

public class Radix {
  public static void main(String[] args) {
    int[] data = new int[] {12, -13, 21, -23, 13, 45, 32, -89, -34, -53};
    radixsort(data);
    System.out.println(Arrays.toString(data));
  }
  @SuppressWarnings("unchecked")
  public static void radixsort(int[]data){
    MyLinkedList<Integer>[] buckets = new MyLinkedList[19];
    MyLinkedList storage = new MyLinkedList();
    int index = 0;
    int index2 = 0;
    int placeValue = 1; // 1 reps the ones digit, 10 reps the tens digit and so on
    int maxDigit = getMaxDigit(data);
    for (int i = 0; i < buckets.length; i++) {
      MyLinkedList nums = new MyLinkedList();
      buckets[i] = nums;
    }
    for (int i = 0; i < maxDigit; i++) {
      if (placeValue == 1) {
        for (int x = 0; x < data.length; x++) {
          int num = data[x];
          int digit = (num / placeValue) % 10;
          buckets[digit + 9].add(num);
        }
        // for (int p = 0; p < buckets.length; p++) {
        //   System.out.println(buckets[p]);
        // }
      } else {
        for (int y = 0; y < storage.size(); y++) {
          int num = (int) storage.removeFront();
          //System.out.println(num);
          int digit = (num / placeValue) % 10;
          //System.out.println(digit);
          buckets[digit + 9].add(num);
          //System.out.println(buckets[digit + 9]);
          //System.out.println(storage);
        }
        storage = new MyLinkedList();
      }
      // link all the linked lists together have to take into account nulls due to my implementation of linked list
      while (index < buckets.length - 1) {
        if (buckets[index].size() != 0) {
          storage.extend(buckets[index]);
        }
        index++;
      }
      placeValue *= 10;
      System.out.println(storage);
      for (int j = 0; j < buckets.length; j++) {
        buckets[j].clear();
      }

      //System.out.println(placeValue);
    }
    //data = storage;
  }

  public static int getMaxDigit(int[] data) {
    int max = 0;
    for (int num : data) {
      int count = 1;
      int temp = num;
      while (temp / 10 != 0) {
        count++;
        temp = temp / 10;
      }
      if (count > max) {
        max = count;
      }
    }
    return max;
  }
}
