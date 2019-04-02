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
    while (current != null){
      ans += current.getData();
      if (current.next() != null){
        ans += ", ";
      }
      if (current.next() != null){
        current = current.next();
      } else {
        return ans;
      }
    }
    return ans;
  }
  public boolean add(E element) {
    if (length == 0){
      start.setData(value);
      end.setPrev(start);
      length++;
      return true;
    }
    if (length == 1){
      end.setData(value);
      start.setNext(end);
      length++;
      return true;
    }
    Node addToEnd = new Node(value,null,null);
    end.setNext(addToEnd);
    addToEnd.setPrev(end);
    end = addToEnd;
    length++;
    return true;
  }
  public void extend (MyLinkedList<E> other) {
    this.end.setNext(other.start);
    other.start.setPrev(this.end);
    this.end = other.end;
    other.start = null;
    other.end = null;
    this.length += other.size();
    other.length = 0;
  }
  public E removeFront() {
    Node next = start.next();
    E oldData = start.getData();
    start.setNext(null);
    start = next;
    return oldData;
  }
}
