package ua.ithillel.tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add(" river");
        words.add(" nation");
        words.add(" income");
        words.add(" river");
        words.add(" river");
        words.add(" income");
        words.add(" drawer");
        words.add(" revolution");
        words.add(" river");
        words.add(" problem");
        words.add(" river");
        words.add(" competition");
        words.add(" problem");
        words.add(" revolution");
        System.out.println(countOccurrence(words," revolution"));
    }

    private static int countOccurrence(ArrayList<String> words, String word) {
        return Collections.frequency(words, word);
    }
}
