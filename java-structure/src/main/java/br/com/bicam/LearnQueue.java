package br.com.bicam;

/*
 * FIFO
 */

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LearnQueue {

    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("João", 21));
        supermarket.add(new Person("Paulo", 22));

        LinkedList<Person> list = new LinkedList<>();
        list.addAll(supermarket);

        ListIterator<Person> listOf = list.listIterator();
        while(listOf.hasNext()){
            System.out.println(listOf.next());
        }

        // get it in reserve order
        while(listOf.hasPrevious()){
            System.out.println(listOf.previous());
        }

        System.out.println("====================================");
        // System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());  // get and delete
        System.out.println(supermarket.peek());  // just get
    }
}

class Person {
    private String name;
    private int age;
    
    protected Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}