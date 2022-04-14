package ua.ithillel.phonebook;

import java.util.ArrayList;

public class Phonebook {
    private final ArrayList<Entry> phones;

    public Phonebook(ArrayList<Entry> phones) {
        this.phones = phones;
    }

    public void add(Entry entry) {
        phones.add(entry);
    }

    public Entry find(String nameFound) {
        for (Entry phone : phones) {
            String[] entries = phone.getEntry().split(", ");
            String nameEntry = entries[0];
            if (nameFound.equals(nameEntry)) {
                return phone;
            }
        }
        return null;
    }

    public ArrayList<Entry> findAll(String nameFound) {
        ArrayList<Entry> allEntriesByName = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            String[] entries = phones.get(i).getEntry().split(", ");
            String nameEntry = entries[0];
            if (nameFound.equals(nameEntry)) {
                allEntriesByName.add(phones.get(i));
            }
        }
        if(allEntriesByName.size()==0){
            return null;
        }
        return allEntriesByName;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phones=" + phones +
                '}';
    }
}