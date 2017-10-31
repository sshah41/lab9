package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {
  /* CHANGED BELOW FOR LAB7(week 9)
  public static void main(String args[]) {
    System.out.println("Enter the size of the stack :");
    final Scanner input = new Scanner(System.in);
    int n;
    n = input.nextInt();
    while (input.hasNextLine()) {
      Stack<String> stack = new Stack<>();
      System.out.println("Enter the data to the stack");
      for (int i = 0; i <= n; i++) {
        stack.push(input.nextLine());
      }
      System.out.println("The reversed Stack ");

      while (!stack.empty()) {

        System.out.println(stack.pop());
      }
      return;
    }
  }*/
  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }
  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
  }
}
