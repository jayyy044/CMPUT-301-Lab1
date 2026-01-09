package com.example.petshop;

import java.util.Date;

// To turn a java class into a abstract one we add the abstract key word into it
//Rules of making a class abstract
/*
    1. Abstract classes function as a template for classes extending them
    2. The abstract class itself cannot be instantiated anymore
       - So when we instantiated pet in the main java file it turned red to indicate
         that this was not allowed
    3. Any methods/functions that are not labelled abstract are inherited by child classes and can be
       can be used without issue
    4. If a method/function is labelled as abstract a class extending the abstract class must
       implement the function/method if they don't it causes a compilation error
*/
//The point of abstract classes is to function as a template with functions/methods for children classes

public abstract class Pet {
    //Class Attributes or Instance Variables
    private String name;
    private Date birthdate;

    //Getter and Setters for each instance variable
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Java Constructors are identified by functions/methods with the same name as a
    /*
        Java Constructors are identified by functions/Methods that are defined with the same
        name as the class and java is able to identify which one to use if multiple are defined
        based on the provided arguments when the class is instantiated.
        Additionally, Java classes don't have a return type
    */
    public Pet(String petName){
        //This is to refer to the specific instance that is created it the same as self
        this.name = petName;
        this.birthdate = new Date();
    }

    public Pet(String petName, Date petBirthDate){
        this.name = petName;
        this.birthdate = petBirthDate;
    }

    public abstract String speak();

}
