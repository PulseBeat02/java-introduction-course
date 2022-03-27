package week17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

  public static void main(String[] args) {

    // PRIMITIVES VS WRAPPER TYPES

    // As you know, you define a primitive integer as so:
    int number = 5;

    // In Java, there are classes called wrapper classes. These classes store a primitive
    // that can be modified. In other words, for example:
    Integer wrappedNumber = new Integer(number);

    // Wrapper classes are capitalized. Unlike primitives, they are classes that store a primitive.

    // int -> Integer
    // double -> Double
    // char -> Character
    // long -> Long
    // float -> Float
    // short -> Short
    // boolean -> Boolean

    Double decimal = new Double(0.5);
    Character character = new Character('c');
    Boolean bool = new Boolean(true);

    // You may ask what the point of these wrapper classes are. Well, for one thing, they allow you
    // to store a primitive inside them. However, the more important thing is that they can be
    // used for collections.


    // COLLECTIONS

    // What are collections?
    // Collections are a data structure that stores data in a multitude of ways in Java.

    // There are many types of Collections in Java. Some of the more known ones that we
    // will be covering today are List, Set, and Map



    // LISTS

    // A List is just a list of objects. You can add or remove from the list and the size
    // can change. A List can have duplicate objects.

    // The most common type of list in Java is ArrayList.

    List<Integer> list = new ArrayList<>();

    // The format is as follows:
    // List<[type]> [name] = new ArrayList<>();

    // You must substitute type with a class. In this case, this can be Integer, Double, Float, etc.
    // However, this CANNOT be substituted with a primitive.

    // Define a List full of Long's called "longList" (hint: long -> Long)
    List<Long> longList = new ArrayList<>();

    // To add to a list, you call the add method of the list
    list.add(5); // Adds 5 to the list. The list is now [5]
    list.add(6); // Adds 6 to the list. The list is now [5, 6]
    list.add(8); // Adds 8 to the list. The list is now [5, 6, 8]
    System.out.println(list);

    // You can also set a place to add the number. For example, if the list is [5, 6, 8], and you
    // wanted to add 7 in between 6 and 8, you can specify the index inside the list to add.
    list.add(2, 7); // Adds the element at index 2. [5, 6, 7, 8]
                                  //                                     ^
                                  //                                     |
    System.out.println(list);

    // To remove from a list, you call the remove method of the list. This removes an element at
    // a specific index.
    list.remove(1); // removes the element at index 1. The list is now [5, 7, 8]
    System.out.println(list);

    // To check if an element exists in a list, you call the contains method of the list. This
    // returns true if the list contains the element and false otherwise.
    System.out.println(list.contains(5)); // true
    System.out.println(list.contains(-1)); // false

    // Create a Boolean list named "boolList". Add true and false to it. Remove the true element
    // from the list.
    List<Boolean> boolList = new ArrayList<>();
    boolList.add(true); // [true]
    boolList.add(false); // [true, false]
    boolList.remove(0); // [false]
    System.out.println(boolList);



    // SETS

    // Sets are different. Unlike List, Set cannot contain any duplicate elements. A Set also does not
    // maintain order. However, you can add and remove as many elements as you would like.

    // The most common types of Sets in Java are HashSet and TreeSet.


    // HASHSET

    // The HashSet is a Set based on hashing. It is very fast because it uses a hashing algorithm.

    // To define an Boolean HashSet:
    Set<Boolean> set = new HashSet<>();

    // The format is as follows:
    // Set<[type]> [name] = new HashSet<>();

    // Adding to a set:
    set.add(true);
    set.add(false);
    System.out.println(set);

    // Because a Set does not have order, you cannot remove an element based on index. If you want
    // to remove an element, you have to remove the actual object from the element. For example:
    set.remove(true);
    System.out.println(set);

    // Check if set contains element:
    System.out.println(set.contains(true));

    // Create a double HashSet called "doubleSet", and add the numbers 0.5, 2.5, and -1.5 to it.
    // Remove -1.5 from the set, and then print out if the set contains 1.5.
    Set<Double> doubleSet = new HashSet<>();
    doubleSet.add(0.5);
    doubleSet.add(2.5);
    doubleSet.add(-1.5);
    doubleSet.remove(-1.5);
    System.out.println(doubleSet.contains(1.5));


    // TREESET

    // The TreeSet is a Set is sorted order. You can specify an order for how the elements are
    // sorted inside the Set.

    // To define an Integer TreeSet
    Set<Integer> treeset = new TreeSet<>();

    // Set<[type]> [name] = new TreeSet<>();

    // Adding and removing use all the same methods above. The only difference however is that
    // a TreeSet stores the elements in sorted order rather than a hashed order. For example:

    treeset.add(1);
    treeset.add(-1);
    treeset.add(1000);
    treeset.add(5);
    treeset.add(-10000000);

    System.out.println(treeset); // [-10000000, -1, 1, 5, 1000] (sorted ascending order)

    // Create a float TreeSet called "floatSet", and add the numbers 0.5f, 1.5f, 2.5f, and -1.5f to it.
    Set<Float> floatSet = new TreeSet<>();
    floatSet.add(0.5f);
    floatSet.add(1.5f);
    floatSet.add(2.5f);
    floatSet.add(-1.5f);

    // MAPS

    // Maps are a way to store data key to value. This is similar to dictionary in Python, where
    // you have a key and a value. All keys must be unique; however, values can be duplicated. For
    // example:

    // [1] -> ["hi"]
    // [2] -> ["bye"]
    // [3] -> ["hello"]
    // [5] -> ["hi"]

    // There are mainly two types of Maps used. HashMap and TreeMap.


    // HASHMAP

    // HashMaps use a hashing algorithm to get the value from a key fast. For example, defining an
    // Integer to String HashMap would look like the following:
    Map<Integer, String> map = new HashMap<>();

    // The format is as follows:
    // Map<[key type], [value type]> [name] = new HashMap<>();

    // To add to a map, you use the put method and specify the key and value.
    map.put(1, "hi"); // key is the first argument, value is the second argument. {1=hi}
    map.put(5, "bye"); // {1=hi, 5=bye}
    System.out.println(map);

    // To remove from a map, you use the remove method. You pass in the key to remove inside
    // the map.
    map.remove(1); // {5=bye}
    System.out.println(map);

    // To replace an existing value inside the map, you can use the replace method. You pass in
    // the key and the new value to set for that key.
    map.replace(5, "hi"); // {5=hi}
    System.out.println(map);

    // To check if a certain key is in a map, use the containsKey method
    System.out.println(map.containsKey(5));

    // To check if a certain value is in a map, use the containsValue method
    System.out.println(map.containsValue("hi"));


    // TREEMAP

    // TreeMaps have the same methods as HashMap. The only difference is that a TreeMap is sorted
    // based on its keys. However, everything else (methods) are the exact same. Defining an integer
    // to String TreeMap is as follows:
    Map<Integer, String> numTreeMap = new TreeMap<>();

    // The format is as follows:
    // Map<[key type], [value type]> [name] = new TreeMap<>();


    // PROBLEMS

    // (1) If you created a TreeSet with the values 91, 93, 87, 67, 98, and 85, what will be the
    // order of the elements inside the set?

    // (2) What are some basic differences between a List and a Set?

    // (3) What is useful about a List which makes it friendlier to use compared to an array?
    // (Hint: think about size)

    // (4) What is the wrapper type for long?

  }

}
