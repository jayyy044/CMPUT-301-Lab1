package com.example.petshop;

/*
* So an interface similar to an abstract class however there some key differences
    * An interface only have method signatures (abstract methods) it doesn't have any
      inheritable methods the same way an abstract class does
    * Same with abstract classes it cannot be instantiated
    * A class can implement several interfaces however it can only inherit from one parent class
    * It is implied that all an interfaces methods are public and abstract you don't have to write
      those when defining the method signatures but you can for example
      * public interface Pettable {
            Option 1: Explicit (verbose)
            public abstract void pet();

            Option 2: Only public (abstract is implied)
            public void pet();

            Option 3: Nothing (both public and abstract implied)
            void pet();
        }
    * The best way to describe the purpose of an interface is defining "Can-Do" relationship for all
      classes that implement it as compared to the "What-It-Is" relationship seen with extending classes
* */

public interface Pettable {
    public void pet();
}
