package dataStructures.stack;

/* ABOUT STACK:
   ------------
*  To examine the item most recently added (Last In First Out)
*
*  USAGE:
  -----------
*
*
* */


/* OBJECTIVE:
   ------------
*  Implement Stack using Linked List and Resizing array
* */


public interface Stack<T> {

    void push (T item);
    T pop();
    boolean isEmpty();
    int size();

}
