package com.example.petshop;

import java.util.Date;

public class Frog extends Pet implements Pettable{
    public Frog(String frogName){
        super(frogName);
    }
    public Frog(String frogName, Date birthdate){
        super(frogName, birthdate);
    }

    @Override
    public String speak(){
        return "ribbits";
    }

    @Override
    public void pet(){
        System.out.println("Frog ribbits");
    }


}
