package dataStructures.queue;

/* ABOUT QUEUE:
   ------------
*  To examine the item least recently added (First In First Out)
*
*  USAGE:
  -----------
*
*
* */


/* OBJECTIVE:
   ------------
*  Implement Queue using Linked List and Resizing array
* */

public interface Queue<T> {
    void enqueue(T item);
    T deque();
    boolean isEmpty();
    int size();
}
