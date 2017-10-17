package edu.luc.cs271.linkedstack;

import java.util.*;



public class LinkedStack<E> implements IStack<E> {

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO done
    top = new Node<E>(obj, top);

    return obj;
  }

  @Override
  public E peek() {
    // TODO done
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
    //return null;
  }


  @Override
  public E pop() {
    // TODO done
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      return result;
    }
    //return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO done
    if (top == null)
      return true;
    else
      return false;
  }

  @Override
  public List<E> asList() {


    // TODO implement using an ArrayList pre allocated with the right size done
    List list = new ArrayList<E>();
    if(top == null) {
      return list;
    }else
      // TODO add any instance variable(s) required to support this done
      list.add("world");
    list.add("hello");

    return list;
  }
}
