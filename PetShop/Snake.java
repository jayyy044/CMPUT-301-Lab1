package com.example.petshop;

import java.util.Date;

public class Snake extends Pet{
    public Snake(String snakeName){
        super(snakeName);
    }
    public Snake(String snakeName, Date birthdate){
        super(snakeName, birthdate);
    }

    @Override
    public String speak(){
        return "hiss";
    }
}
