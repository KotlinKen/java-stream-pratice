package service;


import java.util.Hashtable;

public class Retrieve {

    public void retrieveHashTable(){
        Hashtable hashTable = new Hashtable();

        hashTable.put(1, "testing unit1");
        hashTable.put(441, "banana");

        System.out.println(hashTable.containsKey(441));


        hashTable.entrySet().stream().forEach(System.out::println);

    }
}
