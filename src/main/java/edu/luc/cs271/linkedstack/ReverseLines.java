package edu.luc.cs271.linkedstack;
import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {
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
    }
}