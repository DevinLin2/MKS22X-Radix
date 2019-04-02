import java.util.*;

public class MyLinkedList<E> {
  private class Node<E> {
    private E data;
    private Node next,prev;

    @SuppressWarnings("unchecked")
    public Node(E element, Node prevNode, Node nextNode){
      data = element;
      prev = prevNode;
      next = nextNode;
    }
    public Node next(){
      return next;
    }
    public Node prev(){
      return prev;
    }
    public void setNext(Node other){
      next = other;
    }
    public void setPrev(Node other){
      prev = other;
    }
    public E getData(){
      return data;
    }
    public E setData(E value){
      E oldData = data;
      data = value;
      return oldData;
    }
    public String toString(){
      return data + "";
    }
  }

  private int length;
  private Node start,end;
  public MyLinkedList() {
    Node start = new Node(null,null,null);
    Node end = new Node(null,null,null);
    start.setNext(end);
    end.setPrev(start);
    length = 0;
  }

  public void clear() {
    Node newStart = new Node(null,null,null);
    Node newEnd = new Node(null,null,null);
    start = newStart;
    end = newEnd;
    length = 0;
    start.setNext(end);
    end.setPrev(start);
  }
  public String toString() {
    Node current = start;
    String ans = "";
    while(current.next != null){
      ans += current.getData();
      current = current.next;
    }
    return ans;
  }
  // public boolean add(E element) {
  //
  // }
  // public void extend (MyLinkedList<E> other) {
  //
  // }
  // public E removeFront() {
  //
  // }
}
