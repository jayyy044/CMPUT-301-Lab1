package com.example.petshop;

import java.util.Date;
//When extending a parent class its always " child-class-name extends parent-class-name"
public class Cat extends Pet implements Pettable {

    public Cat(String catName) {
        //Super is used to call the parent class constructors and use their design
        //This allows us to reuse code
        super(catName);
    }

    public Cat(String catName, Date birthDate) {
        super(catName, birthDate);
    }
    //Ensure to put override decorator above function you implementing from abstract class
    //Its considered a good practice and helps avoid errors at compile time
    @Override
    public String speak(){
        return "meow";
    }

    @Override
    public void pet(){
        System.out.println("Cat Meows");
    }
}
