public class Radix {
  public static void radixsort(int[]data){
    MyLinkedList[] storage = new MyLinkedList[10];
    for (int i = 0; i < storage.length; i++) {
      MyLinkedList nums = new MyLinkedList();
      storage[i] = nums;
    }
  }
}
