package ua.ithillel.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("work", "people", "sun", "cat", "dog", "people", "job",
                "wall", "street", "dog", "wall", "wall", "work"));
        calcOccurance(words);
    }

    private static void calcOccurance(ArrayList<String> words) {
        ArrayList<String> newList = new ArrayList<>();
        for (String element : words) {
            if (!newList.contains(element)) {
                newList.add(element);
                System.out.println(element + ": " + Collections.frequency(words, element));
            }
        }
    }
}
