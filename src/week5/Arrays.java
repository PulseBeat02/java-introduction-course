package week5;

public class Arrays {

  public static void main(String[] args) {

    // QUICK REVIEW

    // Define an integer
    int variable = 5;

    // Define a boolean which determines if 5 is equal to 5
    boolean condition = 5 == 5;

    // Check if this following condition is true, and if it is,
    // print out true.
    if (condition) {
      System.out.println(true);
    }

    // What will this print out?
    System.out.println(!!true);

    // What will this print out?
    boolean equals = 6 == 5;
    boolean greater = 3 > -1;
    boolean less = 5 < 2;
    System.out.println(equals && greater && less);

    // What will this print out for the values of a, b, and c?

    int a = 2;
    int b = 5;
    int c = 9;

    if (a > b) { // false
      a += b;
      b += c;
    } else if (a == b) { // false
      a += c;
      c += a;
    } else { // true
      a += a; // a -> 4
      b += a; // b -> 9
    }

    if (a * b > c) { // true
      a--; // a -> 3
      a -= 5; // a -> -2
    }

    System.out.println(a);

    // ARRAYS

    // Suppose we are making a game which has weather. When we want to make it rain, we want to
    // draw water drops, and keep track of each water drop. Should we create thousands of variables
    // for each water droplet?

    // NO! That would be too time-consuming, obviously. That's why we need to store them in some sort
    // of data structure. Does anyone know what a data structure is?

    // In very simple terms, a data structure is a structure which stores data that can be easily
    // accessed and/or manipulated.

    // In Java, there are many types of data structures. There are built in data structures that can
    // sort our data (for example, if we had a bunch of numbers, and we wanted to sort them in ascending
    // order, we can use a data structure for that).

    // Today, we are going to focus on Java's most basic data structure: an array
    // The array is a data structure that can store data in a structural order. They are similar
    // to matrices in math. For example, a matrix in math could be represented like the following:

    // Does anyone know what a matrix is in math?

    // [ 0, 1, 2 ]
    // [ 3, 2, 1 ]
    // [ 4, 3, 6 ]
    // [ 4, 1, 9 ]

    // The following matrix above is a 3 x 4 matrix because it is 4 units wide and 4 units long.
    // If we were to represent the data above in an array, we would also call it a 3 by 4 array.
    // Because we both have a width AND height, this is an example of a 2D array.

    // What if we only want a 1D array, or like just a simple list going straight of just numbers?
    // (for example, [ 1, 5, 3, 6, etc ]

    // This is called a 1 dimensional linear array. It is 1 dimensional because it only keeps tracks
    // of 1 dimension (length), and it is linear because it only has "one direction". For example,
    // this example:

    // [ 1, 5, 3, 6, 9, 10]

    // Is an array with length 6 (because it has 6 elements), and is linear because it is going
    // only horizontally, but not vertically.

    // ARRAY INDICES

    // Every array in computer science has what are called indices or indexes. These represent the
    // "slot" number within a specific array. In other words, they represent the position of the
    // element inside the array.

    // [ 1, 2, 3, 4, 5]
    //   ^           ^
    // SLOT #1     SLOT #5

    // In Java and many other languages, slots, indexes (or whatever you want to call them), all
    // start at 0!!! This is very important.

    // In the above example, it would look like the following:
    // [ 1, 2, 3, 4, 5]
    //   ^           ^
    // INDEX #0    INDEX #4

    // First Number of Array  -> Index 0
    // Second Number of Array -> Index 1
    // Third Number of Array  -> Index 2
    // And so on

    // What is the index of element "8" for this array?
    // [ 0, -5, -1, 9, 8, 6 ]

    // It is 4

    // ARRAYS IN JAVA

    // In Java, defining a 1 dimensional array is the following format:

    // [data type] [] [variable name] = new [data type][length];

    // For example, defining an integer array with length 5:
    int[] intArray = new int[5];

    // Dividing this apart, we have:
    // int -> data type (integer)
    // []  -> array symbol
    // array -> name of our defined array
    // = -> assign operator
    // new -> we are defining a "new" data structure
    // int -> data type
    // [5] -> length of 5

    // Try defining a double array with length 2
    double[] doubleArray = new double[2];

    // After we define our array, we have to assign some variables to it right?
    // To assign a variable, we use the following format:

    // [array name][index to assign to] = [new value]

    // The new value must be the same type as what we defined the array.
    // For example, we defined the array to be a double, so we must also
    // assign any value in the array as a double.

    // If we don't assign anything in the array, it will go to its "fallback" value,
    // which depends on the data type.

    // boolean -> false
    // int -> 0
    // so on

    doubleArray[0] = 2.0;
    // ^        ^     ^
    // array  index  new value

    // Remember from above how we said indexes in Java start from 0? The same
    // applies here.

    // Try assigning the second element with value 3.0 (be careful here with
    // your index!)

    doubleArray[1] = 3.0;

    // Why 1 instead of 2?
    // Let's look at this graphically:

    // [first element, second element]
    //  index 0          index 1

    // The "second element" of our array is actually at index 1!
    // In other words, the nth element of any array is always going to be at index n - 1

    // What if we try assigning something with a length higher?

    // What's wrong here?
    // doubleArray[2] = 2.5;

    // Our array length is 2
    // Our index is 2

    // If we try running that above, we get an error: ArrayIndexOutOfBoundsException

    // Does anyone know why we get this?
    // The reason is that we tried to assign the 3rd element of an array that is only length 2.
    // Java complains about this, and throws an error as a result.

    // This means, you have to be extremely careful when you assign to your elements. Anytime you
    // see an ArrayIndexOutOfBoundsException, it means you either tried to perform an operation
    // with an element that doesn't exist.

    // We can also create the same error with:
    // doubleArray[-1] = 0.5;
    // Indexes CANNOT be negative

    // RETRIEVING AN ELEMENT

    // When we retrieve an element from an array, it is from the following format:
    // [array name] [index]

    // Simple right?

    // We can assign them to a variable. For example:
    double indexOne = doubleArray[1];

    // We assign the value of the element at the first index of doubleArray to indexOne

    System.out.println(indexOne); // we can print it out as so

    // We can also directly print out the element
    System.out.println(doubleArray[1]);

    // Now try printing out the element at index 0
    System.out.println(doubleArray[0]);

    // What do you think this will print out?
    System.out.println(doubleArray[2]);

    // It would be an error. Does anyone want to explain why we get this error?

    // IMPLEMENTING CONDITIONALS
    // Suppose we want to compare two elements in array and see which one is bigger
    // than another.

    // Remember last week, that we could compare two values as so:
    if (5 > 2) {
      System.out.println("5 is greater than 2!");
    }

    // Let's say we want to see if the second element of the array is larger than
    // the first element of the array.

    // How can we apply what we just learned above with retrieving elements and also
    // what we learned last week to see if the second element of the array is greater than
    // the first element?

    if (doubleArray[1] > doubleArray[0]) {
      System.out.println("The second element of the array is greater than the first element of the array!");
    }

    // Notice how we first retrieve the second value, then we compare it to see if it is greater
    // than the second value.

    // Now, apply the same concept, but instead of checking if the second element is greater than
    // the first, check if they are equal.

    if (doubleArray[1] == doubleArray[0]) {
      System.out.println("The first and second elements of the array are equal!");
    }

    // Now, suppose we want to add the value of the second element of the array to
    // the first value. How can we do that?

    // It turns out we can also use compound operators on arrays at specific elements.
    // For example: doubleArray[1] += 2;

    // Given that we can do that, how can we use the compound operator to add the
    // second element to our first element and assign it as such?

    doubleArray[0] += doubleArray[1];
    // This is the same as doubleArray[0] = doubleArray[0] + doubleArray[1];

  }

}
