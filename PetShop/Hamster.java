package com.example.petshop;

import java.util.Date;


public class Hamster extends Pet implements Pettable{
    public Hamster(String hamsterName){
        super(hamsterName);
    }

    public Hamster(String hamsterName, Date birthdate){
        super(hamsterName, birthdate);
    }

    @Override
    public String speak(){
        return "purrs";
    }

    @Override
    public void pet(){
        System.out.println("Hamster purrs");
    }
}
