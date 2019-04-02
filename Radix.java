public class Radix {
  public static void main(String[] args) {
    int[] data = new int[10];
    radixsort(data);
  }
  @SuppressWarnings("unchecked")
  public static void radixsort(int[]data){
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    // for (int i = 0; i < buckets.length; i++) {
    //   MyLinkedList nums = new MyLinkedList();
    //   buckets[i] = nums;
    // }
    MyLinkedList nums = new MyLinkedList();
    buckets[0] = nums;
    buckets[0].add(5);
  }

  // public static int getMaxDigit(int[] data) {
  //   int max = 0;
  //   for (int i = 0; i < data.length; i++) {
  //
  //   }
  // }
}
