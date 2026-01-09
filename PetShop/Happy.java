package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    public Happy(){
        super();
    }

    public Happy(Date hDate){
        super(hDate);
    }
    @Override
    public String getMood(){
        return "Happy Mood";
    }
}
