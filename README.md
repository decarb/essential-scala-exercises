# essential-scala-exercises

## Introduction

This respository contains additional exercises to the book **Essential Scala** by **Noel Welsh** and **Dave Gurnell** as well as the answers to them. It follows a section-by-section workflow where the exercises in a specific section test the content of that specific section inside of the book. The answers for each individual section are also seperated by branch name.

## Section 1 - Basics and Setting Up

The branch `1-setup` contains the setup files for the exercises that follow.

## Section 2 - Expressions, Types and Values

1. Create an object literal called `NumberStuff` that has a method called `square`. The method takes a Double as an argument and returns a Double equal to the square of that number.
2. Extend your `NumberStuff`object to include another method called `increment`. This method takes a Double as an argument and returns that number plus 1.
3. Extend you `NumberStuff` object to include a new method called `divideBy` which takes two arguments both of type Double. The first argument is the number you want to divide and the second is the divisor. Return the first number divided by the divisor if the divisor is not 0 otherwise return 0.
4. Create a new object literal called `StringStuff` that implements a method called `isLong` which takes a String as an argument. This method should return true if the String is longer than 7 characters; otherwise it returns false.
5. Extend your `StringStuff` object with a method called `isFirstCap` which takes a String as an argument. The method returns true if the first character of the String is an upper-case character (A, B, C, D, etc.) or false if it is lower-case.

## Section 3 - Objects and Classes

1. Create a class called `Rectangle` which has a constructor with arguments `width` and `length` that define the width and length of the Rectangle respectively. Make sure to store the values parsed in with the constructor inside the class itself! The arguments should both be of type Double. (HINT: Constructor arguments cannot have the same name as the class parameters! You can also look for a very neat example detailing how to get around this on page 60.) 
2. Create a companion object for your `Rectangle` class that contains an `apply` method which creates a `Rectangle` for you without needing to call the `new` syntax. (HINT: Have a look at page 70)
3. Extend your companion object to contain a method called `square` which takes a single argument of type Double and returns a `Rectangle` where both the width and the length are equal to the supplied argument.
4. Define a method inside the `Rectangle` class called `area` that returns the area of the `Rectangle`.
5. Create a case class with the name `Person`. The case class has 3 fields which include `name` and `surname` as Strings and `drunk` as a Boolean.
6. Create an object called `Cop`
7. Define a method for the `Cop` object called `inspect` which takes a `Person` object as an argument. The method should pattern match over the `Person` and return appropriate Strings for whether or not the person is drunk. If they are drunk return a message involving their name and surname which tells them they are drunk and if they aren’t drunk then just return some message to tell them to move on. (HINT: Check page 80)

## Section 4 - Modelling Data with Traits

1. Create a trait called `Shape` which defines two abstract methods (methods that only have a signature) called `area` and `perimeter`. These methods should both return Doubles. An example of an abstract method is as follows: 
```scala
def giveString: String
```
2. Create a new trait `Rectangular` which extends the `Shape` trait. A `Rectangular` instance should have a `width` and `length` both of type Double. Notice how your IDE is complaining that certain methods need to be implemented. This is due to your `Rectangular` trait extending the previous `Shape` trait but it has not yet implemented both of the abstract methods that we defined there. For the work to compile you’ll need to implement the `area` and `perimeter` methods defined inside the `Rectangular` trait. You can override inherited methods by using the following: 
```scala
overide def foo(bar: Bar): Baz = ???
```
3. Now create two case classes, `Square` and `Rectangle`, which extend the `Rectangular` trait. Ensure that you set the inherited fields correctly inside the `Square` case class.
4. Implement the base model for a `StringList` which is similar to the `IntList` model described on page 110 except that it acts as a `LinkedList` for Strings and not Integers.
5. Add a method called `concatenate` inside the `StringList` trait which returns a concatenation of all the elements in the `StringList`. 
