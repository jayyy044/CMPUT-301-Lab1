package com.example.petshop;

import java.util.Date;

//This is the syntax that used when implementing interfaces:
//public class ClassName implements Interface1, Interface2, Interface3
public class Dog extends Pet implements Pettable{
    public Dog(String dogName){
        super(dogName);
    }
    public Dog(String dogName, Date birthdate){
        super(dogName, birthdate);
    }

    @Override
    public String speak(){
        return "bark";
    }

    @Override
    public void pet() {
        System.out.println("Dog Barks");
    }
}
