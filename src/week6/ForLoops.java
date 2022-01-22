package week6;

public class ForLoops {

  public static void main(String[] args) {

    // ARRAYS REVIEW

    // What are arrays? How are their indexes handled?

    // Define a String array with length 2, and define the first element as
    // "Hello", and the second element as "World"
    String[] strArray = new String[2];
    strArray[0] = "Hello";
    strArray[1] = "World";

    // Define an integer array with length 5 called "array"
    int[] array = new int[5];

    // How do we set the value of the 4th element to be 3?
    array[3] = 4; // why is the index 3 and not 4?

    // What happens if we do array[5]?
    // What about array[-1]?

    // How do we check if the 3rd element is greater than the 1st for the array?
    if (array[2] > array[0]) {
      System.out.println("The 3rd element is greater than the 1st element!");
    }

    // How do we increment the second element by 1
    array[1]++;

    // Fun fact, you can actually define arrays like so
    String[] myArray = {"Hello", "World"};
    // you don't need to do new, and it will automatically assign the values

    // FOR LOOPS

    // Suppose we are presented with the following scenario:
    // We have our 1000 water drops stored in our array. (Remember last week when we talked about
    // storing our 1000 water drops inside our array, so it can be easier to handle all the data).

    // Now we want to print them all out at once. Surely we can't do
    // System.out.println(array[0]);
    // System.out.println(array[1]);
    // System.out.println(array[2]);
    // etc ... right?

    // That's when loops come in. What is a loop?
    // A loop is a block code which will continue to repeat until a certain condition is met.
    // There are many types of loops such as for loops, for-each loops, while loops, do-while loops,
    // etc. But today we are only focusing on for loops.

    // In Java, we have two types of for loops. We have the "enhanced-for" loop (or some may call
    // the for each loop).

    for (int element : array) {
      System.out.println(element);
    }

    // And we have the normal for loop.
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // Both of these loops produce the same output. Let's focus on the enhanced-for loop first.

    // ENHANCED-FOR LOOP

    // Let's break it down. So basically we have the following format:

    // for ([element] : [data structure]) {
    //    // do something with element
    // }

    // This may be quite confusing here, so let's elaborate on it.

    // For "[data structure]", it's pretty easy. We can just pass in our data structure
    // (which in this case, is an array). So it would be something like:

    // for ([element] : array) {
    //    // do something with element
    // }

    // But how does "[element]" work? Well, in a for-each loop, we are "looping" through
    // each of the elements. We basically define a temporary variable which is assigned
    // to the current element of the array. In other words, for example, if our integer
    // array had the elements {3, 2, 1}

    // first iteration -> temporary variable = 3
    // second iteration -> temporary variable = 2
    // third iteration -> temporary variable = 1

    // And we can use that variable for something we need. For example, in this case,
    // we want to print it out, so we print it out using System.out.println();

    // We don't have to name the "temporary variable" a specific name. We can name it
    // anything we want. As long as it follows the same type of the array (which in
    // this case is int[], notice how in the example we defined it as **int** element)

    // Given this array here, I want you to print each value out but divided by 2
    int[] mystery = {5, 4, 3, 2, 1};
    for (int element : mystery) {
      System.out.println(element / 2);
    }

    // FOR LOOP

    // Now for-each loops are simple. They automatically loop through the elements
    // for you, and you don't need to do any index based checking in order. But what
    // if we wanted to also print out the element that is before the current element?

    // Let's take a look at our for loop
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // If we break it down, we get the following syntax:
    // for (initialization; condition; iteration (or updation)) {
    //   // do something
    // }

    // initialization -> notice in our for loop we have int i = 0. We are "defining" the variable
    // that i is going to be, as well as the variables that we are going to be using in this loop.
    // This part is only done once in the first iteration. The variable can be named anything, and
    // since we are dealing with indexes here, we make it an integer. We use this variable within
    // our code.

    // condition -> this is the condition that the loop checks every single time the loop occurs.
    // For example, in this case, array.length returns the length of our array. It loops AS LONG
    // as i is below the array length. If it is equal or above the array length, it stops. This
    // condition is checked first too, and after the block of code runs.

    // iteration (or updation) -> this is usually the part where we update our variable. There are
    // obviously exceptions to this (for example, we can update it inside our loop logic too), but
    // in this case we see i++. We are "updating" the value of i, and incrementing it by 1. This is
    // done AFTER the block of code is executed.

    // Putting this together, we can write out the logic for the loop we have above.

    // ITERATION #1
    // Initialize Variable -> Okay, now we know i = 0, and it is an integer
    // Check Condition -> Since i (0) is less than the length of the array, we can continue to loop
    // Execute block of code (System.out.println(array[0]);)
    // Update Variable -> Let's do i++ -> i is now 1

    // ITERATION #2
    // We don't need to initialize the variable because we already defined it in ITERATION #1.
    // Check Condition -> Since i (1) is less than the length of the array, we can continue to loop
    // Execute block of code (System.out.println(array[1]);)
    // Update Variable -> Let's do i++ -> i is now 2

    // ITERATION #3
    // We don't need to initialize the variable because we already defined it in ITERATION #1.
    // Check Condition -> Since i (2) is less than the length of the array, we can continue to loop
    // Execute block of code (System.out.println(array[2]);)
    // Update Variable -> Let's do i++ -> i is now 3

    // Do you get the idea here? It is "looping" through our block of code.

    // Now the code inside our logic. Notice how i is looping through the block of code, and it
    // loops from 0 to array.length - 1. What does that remind of you of? Indexes! Remember how
    // the index of the Nth element is always N - 1? Well, that means the index of the last element
    // is array.length - 1 since array.length is the total length of the array, and we are
    // objectively looping through our index with i. That's why you see System.out.println(array[i]);
    // because we are printing out the element at that specific index.

    // Suppose we wanted to print out the element after the current one. What can we do?
    // Well, we could try the following:
    // for (int i = 0; i < array.length; i++) {
    //   System.out.println(array[i + 1]); // we are printing out the element after, so we do plus 1
    // }

    // But what's wrong here?
    // The issue here is that if i reaches the last index (array.length - 1), it will try to get
    // an element which doesn't exist because there is no "next element". Therefore, this code
    // will create an ArrayIndexOutOfBoundsExceptions.

    // There are two ways to fix this. We can either
    // a) create an if-statement which checks for this, and then exit the loop
    // b) change our condition, and make it stop looping the second to last element (this is much simpler!)

    // a)
    for (int i = 0; i < array.length; i++) {
      if (i + 1 == array.length) { // check if the next element is array.length
        break;
        // break is a statement that will "exit" out of our for loop, and will exit out
        // immediately (not executing any code after). It won't even go to the next
        // loop, it will just literally exit as if the loop ended.
      }
      System.out.println(array[i + 1]); // now it's safe to do this because we checked already!
    }

    // or b)

    // Instead of creating an if statement, we can just change our condition:
    for (int i = 0; i < array.length - 1; i++) { // notice how it's i < array.length - 1 now
      System.out.println(array[i + 1]); // now it's safe to do this because we checked already!
    }

    // Since we are guaranteed to never reach the element at index array.length - 1 (now that
    // we added that restriction and excluded the last element of the array), we won't get this
    // issue!

    // Now suppose we wanted to print "My dog is happy!", 100 times. How can we do that?
    for (int i = 0; i < 100; i++) {
      System.out.println("My dog is happy!");
    }

    // initialization -> i = 0
    // condition -> i < 100
    // iteration/updation -> i++

    // You may be wondering why we use < 100 instead of <= 100 for the condition. Aren't
    // we printing a 100 times though? Does anyone want to guess why this is the case?
    // HINT: It's a counting problem.

    // Well, we are starting from 0, and incrementing until 99 right? (because 99 is the
    // last number right before 100). Well, there are actually 100 numbers between 0 and 99
    // (because 99 - 0 + 1 = 100). This means that we are iterating 100 times.

    // Now try this. Try printing "I am learning Java" 46 times.
    for (int i = 0; i < 46; i++) {
      System.out.println("I am learning Java");
    }

    // Now I have a problem to implement all the skills we have just learned above.
    // This type of problem is called a search problem. These problems are very common,
    // and are used throughout computer science extremely often.

    // Given the following array:
    int[] search = {0, 1, 3, 7, 9, 8};

    // I want you to make a loop which attempts to search through each of the elements
    // for the number 7, and print out the index at that element. Once you find the element,
    // I want you to break out immediately.

    // Here are some hints to this problem:
    // search[i] (where i is the index) gets the element at index i
    for (int i = 0; i < search.length; i++) {
      if (search[i] == 7) { // search[i] is the element, and we check if it's equal to 7
        // If the element is found, we print out i. Remember that i is also the index!
        System.out.println(i);
        break; // exit immediately out of the loop
      }
    }

    // Here's a challenge:
    // Make a loop which prints the elements in reverse order.

    // Normal Solution
    for (int i = 0; i < search.length; i++) {
      int index = search.length - i - 1;
      // i = 0 -> search.length - 0 - 1 -> last element
      // i = 1 -> search.length - 1 - 1 -> second to last element
      // i = 2 -> search.length - 2 - 1 -> third to last element
      // and so on...
      System.out.println(search[index]);
    }

    // Good Solution

    // Notice how instead of starting i as the last element index rather than the first
    // Then we loop until i is less than 0.
    // We subtract 1 from i every time.

    // For example, i is initialized as search.length - 1 which is 4
    // then we subtract 1 to get 3, 2, 1, 0, etc.

    // We have to use >= 0 because when i reaches 0, we don't want to stop. 0 is still
    // an index (first element of the array!).
    for (int i = search.length - 1; i >= 0; i--) {
      System.out.println(search[i]);
    }
  }
}
