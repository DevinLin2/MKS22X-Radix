public class Radix {
  public static void main(String[] args) {
    int[] data = new int[10];
    radixsort(data);
  }
  @SuppressWarnings("unchecked")
  public static void radixsort(int[]data){
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for (int i = 0; i < buckets.length; i++) {
      MyLinkedList nums = new MyLinkedList();
      buckets[i] = nums;
    }
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
