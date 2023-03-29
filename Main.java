package Seminar_4;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        Task1 task1 = new Task1();

        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> reversedList = task1.reverse(list);
        System.out.println(reversedList);


        Task2 task2 = new Task2();

        task2.enqueue(1);
        System.out.println(task2.dequeue());
        task2.enqueue(2);
        task2.enqueue(3);
        System.out.println(task2.first());


        Task3 task3 = new Task3();
        task3.startCalculator();
    }
}
