package edu.luc.cs271.linkedstack;

import java.util.*;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  @Override
  public E push(final E obj) {
    top = new Node<E>(obj, top);

    return obj;
  }

  @Override
  public E peek() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
    // return null;
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      return result;
    }
    // return null;
  }

  @Override
  public boolean isEmpty() {
    if (top == null) return true;
    else return false;
  }

  /* CHANGED BELOW FOR LAB7(week 9)
  @Override
  public List<E> asList() {

    List list = new ArrayList<E>();
    if (top == null) {
      return list;
    } else

      list.add("world");
    list.add("hello");

    return list;
  }*/
  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>(); //used to be: new ArrayList<>(size)
    populateList(top, result); // TODO replace null with the right reference
    return result;
  }


  // ADDED FOR LAB7(week 9)
  private void populateList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
    if(curr != null){
      result.add(curr.data);
      populateList(curr.next, result);;
    }

  }
  // ADDED FOR LAB7(week 9)
  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(); //used to be: new ArrayList<>(size)
    populateFifoList(top, result); // TODO replace null with the right reference
    return result;
  }
  // ADDED FOR LAB7(week 9)
  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
    if(curr != null){
      result.add(curr.next.data);
      populateList(curr, result);;
    }
  }
}
