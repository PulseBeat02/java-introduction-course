package week16;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Classes {

  public static void main(String[] args) {

    // WARMUP

    // (1) Create a class called "Dog". Define the class header first:
//    class Dog {
//
//    }

    // (2) Add two fields into the Dog class. Add a String called "name," storing the name
    // of the dog and an int called "age," storing the age of the dog.

//    class Dog {
//      String name;
//      int age;
//    }

    // (3) Add a constructor in the class that takes in two variables. A String name for
    // the name, and an int age for the age of the dog. Review the notes from last class
    // if you forgot what a constructor is. As a reminder, it is a special type of method!

//    class Dog {
//
//      String name;
//      int age;
//
//      Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//      }
//    }

    // (4) Add methods called "getName" and "getAge" into the class. The "getName" method should
    // return the String that stores the name of the dog, and the "getAge" method should return
    // the int that stores the age of the dog.

//    class Dog {
//
//      String name;
//      int age;
//
//      Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//      }
//
//      String getName() {
//        return name;
//      }
//
//      int getAge() {
//        return age;
//      }
//    }

    // GETTER AND SETTER METHODS

    // What are getter and setter methods? They are just methods that get and set certain variables
    // from inside your class.

    // An example of a getter method is the getName method from the Dog class above. It returns the
    // String name variable from the Dog class. Can you point out another getter method in the Dog
    // class?

    // A setter method is a method that sets the value of a variable. For example, if you added
    // the following to the Dog class:

//    void setName(String name) {
//      this.name = name;
//    }

    // you can call it and pass in the new name you want to set the variable to. Notice how a getter
    // method doesn't have any arguments but has a return type. A setter method is the opposite, where
    // you specify the value you want to set the variable to, but it doesn't return anything.

    // Copy the setName method into the Dog class you wrote.

    // For the above Dog class, write a setter method for the age variable.
    // Make each setter method accept an argument that states what you want to set the age variable to.

    class Dog {

      String name;
      int age;

      Dog(String name, int age) {
        this.name = name;
        this.age = age;
      }

      String getName() {
        return name;
      }

      int getAge() {
        return age;
      }

      void setName(String name) {
        this.name = name;
      }

      void setAge(int age) {
        this.age = age;
      }
    }

    // DEFINITION OF A CLASS

    // When we define an instance (remember, class is the blueprint, and instance is the actual
    // house put into place!), we use the new keyword. For example, if we wanted to define a String,
    // we can use the new keyword as such:

    String str = new String("Hello World");

    // The same applies for any class such as the Dog class created above! You may ask though what
    // arguments do we pass in inside the parenthesis? In the new String object above, we passed
    // "Hello World". Any arguments you pass into there get passed to the constructor.

    // For example, defining a Dog instance with the name "Lucy" and age "5"
    Dog lucy = new Dog("Lucy", 5);

    // Notice how in the constructor, our String name is the first argument, and the int age is the
    // second argument. All the arguments must match.

    // Define a Dog instance with the name "Ripley" and age "9". Name this dog variable "ripley".
    Dog ripley = new Dog("Ripley", 9);

    // Define a Dog instance with the name "Riley" and age "6". Name this dog variable "riley".
    Dog riley = new Dog("Riley", 6);


    // USING METHODS ON OBJECTS

    // For the "riley" variable above, call the "setName" method on it. Pass in the argument "Bark"
    riley.setName("Bark");

    // You just called the setter method, and set the name of the dog to be Bark!

    // Now try to print out the name of the dog using the getter method for the name.
    System.out.println(riley.getName());


    // MULTIPLE CONSTRUCTORS

    // You can specify multiple constructors inside a class. For example, you can add a second
    // constructor to the Dog class above by using the same constructor format but different
    // arguments:

//    class Dog {
//
//      String name;
//      int age;
//
//      Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//      }
//
//      Dog(int age) {
//        this.name = "PlaceholderDogName";
//        this.age = age;
//      }
//
//      String getName() {
//        return name;
//      }
//
//      int getAge() {
//        return age;
//      }
//
//      void setName(String name) {
//        this.name = name;
//      }
//
//      void setAge(int age) {
//        this.age = age;
//      }
//    }

    // However, there are limitations to this. For example, you cannot have two constructors that
    // have the same arguments. If this were the case, how would Java know which constructor
    // to choose?

    // Multiple constructors are useful because you can define a new Dog object in many
    // ways. After adding the constructor above, you can now define a Dog with only
    // new Dog(5). The name will be already set in the constructor.

    // In the Dog class above, create another constructor that passes in 1 String argument. Set this
    // argument to be the name of the dog. Set the age of the dog to be 1 inside the constructor.

//    Dog(String name) {
//      this.name = name;
//      this.age = 1;
//    }

    // Now define a Dog called "Ruffles" using the new constructor you made.
    // Dog ruffles = new Dog("Ruffles");


    // USAGES IN REAL APPLICATION

    // As we get closer to hopefully a project, observe the following code:

    JLabel label = new JLabel("Image");
    label.setText("Welcome to Programming Class!");
    label.setVisible(true);

    JButton button = new JButton("I'm a Button!");
    button.setText("Click Me!");
    button.setVisible(true);

    JFrame frame = new JFrame("Hello World");
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    frame.add(label);
    frame.add(button);
    frame.setVisible(true);
  }

}
