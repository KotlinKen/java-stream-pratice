package service;


import java.util.Hashtable;

public class Retrieve {

    public void retrieveHashTable(){
        Hashtable hashTable = new Hashtable();

        hashTable.put(1, "testing unit1");
        hashTable.put(441, "banana");

        System.out.println(hashTable.containsKey(441));


        hashTable.entrySet().stream().forEach(System.out::println);


//        hashTable.clear();
        hashTable.clone();
        hashTable.compute(441, (k, v)-> v + "it's computed");

        System.out.println(hashTable.get(441));


        hashTable.computeIfAbsent(4413, k-> k + "test");

        hashTable.computeIfPresent(441, (k, v) -> v+" it's present");


        hashTable.contains(hashTable);


        hashTable.containsKey(441);
        hashTable.containsValue("test");


        hashTable.entrySet().stream().forEach(System.out::println);

    }
}
