package week9;

public class Strings {

  public static void main(String[] args) {

    // WHAT IS A STRING?
    String str = "A String!";

    // A String is a sequence of characters. It's pretty much a char[] internally.

    // Strings are immutable. What does immutable mean?
    // Immutable means constant, or not changing. This means that after you define
    // a String, the value of the String cannot be changed internally (unless you
    // reassign it)

    // SPECIAL CHARACTERS IN A STRING

    // If you notice, you cannot do:
    // System.out.println(""Double Quotes!"");

    // There are many special characters in a String. Some of these include:
    // \n -> Inserts a new line
    // \r -> Inserts a carriage return
    // \" -> Inserts a double quote
    // \\ -> Inserts a backslash

    // The correct way to print "Double Quotes" (with the quotes), would be:
    System.out.println("\"Double Quotes\"");
    // Notice how in "\"Double Quotes\"", there are still quotations outside
    // the slashes (" \"Double Quotes\" ")

    // Print a new line
    System.out.println("First Line \n New Line!");

    // Try printing \Backslashes\ (with the backslashes):
    System.out.println("\\Backslahes\\");


    // STRING CONCATENATION

    // What is concatenation?
    // Concatenation is basically combining elements together. String concatenation
    // is when you combine essentially many objects together to form a String.

    // The easiest way to do this is using the '+' sign

    int apples = 5;
    System.out.println("I have " + apples + " apples!");

    // Notice how that I have two plus signs. I have a plus sign before and after the apples variable. This
    // operator applies for any primitive or class. For example, if I wanted to print the bananas
    // variable here:
    double bananas = 10.5;
    System.out.println("I have " + bananas + " bananas!");

    // When performing operations on the variable, you should always use () so Java will know what
    // it should concatenate and what it should calculate. For example:

    System.out.println("5 plus 2 is equal to " + 5 + 2);
    // AND
    System.out.println("5 plus 2 is equal to " + (5 + 2));

    // DO NOT GIVE THE SAME RESULT!

    // PROBLEMS

    // Print out the variable ducks in the following format: I have [#] ducks
    int ducks = 8;
    System.out.println("I have " + ducks + " ducks");

    // Do the same thing now, but print 3 less than ducks. In other words, print out:
    // Taking away 3 ducks from my total gives me [# - 3] ducks.
    System.out.println("Taking away 3 ducks from my total gives me " + (ducks - 3) + " ducks.");



    // INTRODUCING STRING#EQUALS

    // There is a way to compare Strings in Java. Does anyone want to guess how
    // you would do so?

    String first = "Hello World";
    String second = "Hello Worl";
    second = second + "d";
    System.out.println(first == second);

    // The reason why that prints false is because String is a class. In Java,
    // there are mainly two types of categories. Classes and primitives. Primitives
    // (like int, double, float, boolean, etc) are basically values that can be
    // compared using ==.

    // When we have a class, using == will compare its reference in the memory instead
    // of the actual value. This is confusing at first, but will make sense more later on.

    // The proper way to compare the content of these Strings is the equals method.
    System.out.println(first.equals(second));

    // We append .equals on our String and pass in "second" as our argument. This returns
    // a boolean which says if the Strings are equal or not.

    // Print out whether the Strings are equal or not
    String compareMeOne = "El Mundo";
    String compareMeTwo = "World";
    System.out.println(compareMeOne.equals(compareMeTwo));

    // For the confusing part:

    // Suppose we had two boxes. Think of the apples as the String, and the box as the memory
    // Box #1 one has an apple
    // Box #2 has an apple

    // Using .equals will compare the contents of both of these boxes. In this case, it would
    // return true, because both boxes have an apple.

    // However, using == will check if the same box is being used for the apple. Since box #1
    // and box #2 are still considered different boxes (but both contain an apple), it would
    // return false.

    // Here's a diagram which can perhaps explain the confusing part above:
    // https://3.bp.blogspot.com/-KEIYp310Uds/WvZwpRtq5AI/AAAAAAAALV0/Gb6KNX5nJ2IIkvW2MGFUwv5zxqtX-utqwCLcBGAs/w613-h337/equals%2Bvs%2Bequality%2Boperator%2Bin%2BJava.png

    // FIRST PART:
    String s2 = "abc"; // we assign s2 to be "abc"
    String s1 = s2; // if we do this on an object, it assigns the reference of s2 to s1 (similar
    // to a pointer if you want to think about it that way, but it's not)
    System.out.println(s2 == s1); // this will print true because they are pointing to the same memory
    System.out.println(s2.equals(s1)); // this will also print true because they both have the same content

    // SECOND PART:
//    String s1 = "abc"; // we assign s1 to be "abc"
//    String s2 = "ab"; // we assign s2 to be "abc"
//    s2 += "c";
//    System.out.println(s1 == s2); // This returns false. Even though s1 and s2 have the same content,
//    // they are being stored in different places in the memory.
//    System.out.println(s1.equals("s2")); // This returns true. s1 and s2 have the same content (they
//    // both are "abc"), so it would return true.

    // THIRD PART:
//    String s1 = "abc";
//    String s2 = "Hi";
//    System.out.println(s1 == s2); // This would return false because they are both different places
//    // in the memory.
//    System.out.println(s1.equals(s2)); // This would also return false because their content is
//    // different ("abc" and "Hi" are not the same content)

    // PROBLEMS
    String str1 = "a";
    String str2 = "";
    str2 += "a";
    System.out.println(str1 == str2); // what should this print out?

    str2 = str1;
    System.out.println(str1 == str2); // what should this print out?

    String str3 = "a";
    System.out.println(str2.equals(str3)); // what should this print out?

    int a = 5;
    int b = a;
    System.out.println(a == b); // what should this print out?


    // USEFUL STRING METHODS

    // The String class contains many useful methods. Some of these methods include:
    // String#replace, String#substring, String#indexOf, String#lastIndexOf

    // String#replace
    // Replaces a character inside a String:
    System.out.println("abca".replace('a', 'b')); // bbcb

    // String#substring
    // Takes a specific portion from the String, where the beginning index is INCLUSIVE
    // and the ending index is EXCLUSIVE.

    // If a String had the content "abcd"
    // a -> index 0
    // b -> index 1
    // c -> index 2
    // etc..

    // Suppose you want to extract the "abc" part out of "abcd"
    // The starting index would be 0 because you want to start from the first
    // character. The ending index would be 3 because it is EXCLUSIVE, meaning
    // that the last character included would be the character before index 3,
    // or index 2 (which is 'c')
    System.out.println("abcd".substring(0, 3)); // abc

    // String#indexOf
    // Returns the first index of a String for a String.
    // For example, if we wanted to find where the String "bc" is located inside
    // a bigger String: (RETURNS -1 IF THE STRING CANNOT BE FOUND)
    System.out.println("abcd".indexOf("bc")); // returns 1

    // You can also pass a second argument. The second argument is an integer
    // and it specifies where to start looking. For example, if you had the
    // String "abcabcabc", and you wanted to get the second "cab" and not
    // the first "cab" inside the String, you could so something like:
    // (RETURNS -1 IF THE STRING CANNOT BE FOUND)
    System.out.println("abcabcabc".indexOf("abc", 5));

    // String#lastIndexOf
    // Exactly the same of String#indexOf, but pretty much just the opposite.
    // It looks for the last String inside the big String rather than the first one.
    // You can also pass a second argument for an integer for this method.
    System.out.println("ilovecabscabs".lastIndexOf("cabs", 9));

    // PROBLEMS

    // In the following String:
    String carInfo = "Red|Red|Honda|SUV";

    // Get the index of the SECOND "Red" part of the String
    System.out.println(carInfo.indexOf("Red", 3));

    // Get the substring "Honda" part of the String
    System.out.println(carInfo.substring(8, 13));

    // Replace all the pipe characters ('|'), with semi-colons
    System.out.println(carInfo.replace('|', ';'));

    // FINAL PROBLEM SET

    // Given the following data
    String[] data = {"Spigot", "Paper", "Bukkit", "Waterfall"};

    // Write a program which tries to find the index of "Paper" inside the array.
    // HINT #1: Use a normal for loop
    // HINT #2: Use String#equals to check if a String equals "Paper"

    for (int i = 0; i < data.length; i++) {
      String word = data[i];
      if (word.equals("Paper")) {
        System.out.println(i);
        break; // why do we break here?
        // We break here because we already found the element, and it isn't necessary
        // to keep looping through the array anymore.
      }
    }

    // Suppose you have a String[] with the following words:
    String[] words = {"prefix", "prender", "teacher", "professional", "prey"};

    // Write a program which checks if the first 3 letters of any element inside
    // the array is "pre".
    // HINT #1: Use String#substring to get the first 3 characters
    // HINT #2: Use String#equals to check if your substring is equal to "pre"

    int count = 0;
    for (String word : words) {
      String three = word.substring(0, 3);
      if (three.equals("pre")) {
        count++;
      }
    }
    System.out.println(count);
  }

}
