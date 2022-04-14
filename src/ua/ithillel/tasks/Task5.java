package ua.ithillel.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("work", "people", "sun", "cat", "dog", "people", "job",
                "wall", "street", "dog", "wall", "wall", "work"));
        ArrayList<WordWithOccurance> result = calcOccurance(words);
        System.out.println(result);

    }

    private static ArrayList<WordWithOccurance> calcOccurance(ArrayList<String> words) {
        ArrayList<WordWithOccurance> newList = new ArrayList<>();
        for (String element : words) {
            if (!newList.contains(element)) {
                newList.add(new WordWithOccurance(element, Collections.frequency(words, element)));
            }
        }
        return newList;
    }
}

class WordWithOccurance {
    private String name;
    private int occurance;

    public WordWithOccurance(String name, int occurance) {
        this.name = name;
        this.occurance = occurance;
    }

    @Override
    public String toString() {
        return "{" +
                "name: " + '\"' + name + '\"' +
                ", occurance: " + occurance +
                '}';
    }
}
