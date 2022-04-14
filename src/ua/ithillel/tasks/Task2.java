package ua.ithillel.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 8, 9, 6, 7, 3, 12, 47, 45};
        System.out.println(toList(array));

    }

    private static List<Integer> toList(int[] array) {
        List<Integer> intList = new ArrayList<Integer>(array.length);
        for (int i : array) {
            intList.add(i);
        }
        return intList;
    }
}
