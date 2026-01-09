package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad(){
        super();
    }

    public Sad(Date sDate){
        super(sDate);
    }
    @Override
    public String getMood(){
        return "Sad Mood";
    }
}
