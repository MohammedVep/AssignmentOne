/*
Mohammed Vepari
ID: 239698930
Monday September 23rd 2024
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class QuestionTwo {
    public static void main(String[] args) {
        // Store one million integers in a linked list
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++){
            numbersList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>(numbersList);
        // Start using time traverse for the list
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            listIterator.next();
        }
        long endTime = System.currentTimeMillis();
        // Display the time before and after the program execution with iterator

        System.out.println("Time taken to traverse the list using iterator is: " + (endTime - startTime) + " millis.");
        // Time to traverse list using get(index) method
        long startTimeTwo = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            linkedList.get(i);
        }
        long endTimeTwo = System.currentTimeMillis();
        // Display the time before and after the program execution with get(index) method
        System.out.println("Time taken to traverse the list using get(index) method is: " + (endTimeTwo - startTimeTwo) + " millis.");
    }
}
