package ua.ithillel.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 45, 78, 13, 78, 10, 56, 7, 32, 46,
                                                                    20, 77, 78, 45, 12, 10,7,56,13,78,20,1));
        System.out.println(findUnique(numbers));


    }

    public static ArrayList<Integer> findUnique(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (Integer element : numbers) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}
