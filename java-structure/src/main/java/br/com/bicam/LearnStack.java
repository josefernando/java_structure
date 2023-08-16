package br.com.bicam;

/*
 *  LIFO
 */

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for(Integer i : stack){
            System.out.println(stack.get(i-1));
        }

        while(stack.size() > 0 ){
           System.out.println( "for: " + stack.pop());
        }
    }
}
