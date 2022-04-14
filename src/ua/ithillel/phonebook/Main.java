package ua.ithillel.phonebook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Entry alice = new Entry("Alice, +741587");
        Entry mike = new Entry("Mike, +741587");
        Entry maria = new Entry("Maria, +741587");
        Entry john = new Entry("John, +741587");
        Entry alex = new Entry("Alex, +741587");
        Entry maria1 = new Entry("Maria, +369587");
        Entry mike1 = new Entry("Mike, +7477777");

        Phonebook phonebook = new Phonebook(new ArrayList<>());
        phonebook.add(alice);
        phonebook.add(mike);
        phonebook.add(maria);
        phonebook.add(john);
        phonebook.add(alex);
        phonebook.add(maria1);
        phonebook.add(mike1);
        System.out.println(phonebook);
        System.out.println( phonebook.find("Tana"));
        System.out.println(phonebook.findAll("Mike"));
    }
}
