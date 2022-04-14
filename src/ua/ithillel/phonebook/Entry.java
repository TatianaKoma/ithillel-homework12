package ua.ithillel.phonebook;

import java.util.ArrayList;

public class Entry {
    private final String entry;


    public Entry(String entry) {
        this.entry = entry;
    }

    public String getEntry() {
        return entry;
    }

    @Override
    public String toString() {
        return "{" + entry + '\'' +
                '}';
    }
}
