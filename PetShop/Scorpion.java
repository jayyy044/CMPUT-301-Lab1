package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet{
    public Scorpion(String scorpionName ){
        super(scorpionName);
    }
    public Scorpion(String scorpionName, Date birthdate ){
        super(scorpionName, birthdate);
    }

    @Override
    public String speak(){
        return "hiss";
    }
}
