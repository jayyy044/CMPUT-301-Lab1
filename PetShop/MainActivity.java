package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        Pet pet = new Pet("");
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion  = new Scorpion("Scorponok");
        Frog frog = new Frog("Ribbity");
        Hamster hamster = new Hamster("Hammy");
        Snake snake = new Snake("Anaconda");

        /*
        *   To be able to store both of these different objects into one array we need to take
            advantage of upcasting offered in java.
        *   Since in the end in our object hierarchy we have the java object => Pet object =>
            Dog/Cat object
        *   This is equivalent of saying that every Dog or Cat is still a pet
        *   Java does this upcasting by itself there is no implicit syntax needed
        *   However the downside of upcasting is once it done you can no longer access the class specific
            methods so if Cat had a purr method and you put just cat into the list and did this
            *   Cat cat = new Cat("Lucy");
                ArrayList<Pet> petList = new ArrayList<Pet>();
                petList.add(cat);  * Cat is upcast to Pet

                Pet pet = petList.get(0);  * Gets the cat, but as Pet type

                pet.speak();  * Works - speak() is in Pet class
                pet.purr();   * COMPILER ERROR - "cannot find symbol method purr()"
            So as this example displays you can only access the methods and functions in the Pet class
            Since speak is abstract we can access the specific implementation of each class
        *   To combat the effects of upcasting you can also just downcast to get access to the specific
            functions in a class for example
            *   Pet pet = petList.get(0);

                * Downcast: Pet → Cat
                Cat cat = (Cat) pet;  * Explicit cast required
                cat.purr();  * Now it works

                * In one line:
                String sound = ((Cat) pet).purr();
        *   Down casting is not implicit and must be done explicitly
        */

        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);
        petList.add(frog);
        petList.add(hamster);
        petList.add(snake);

//        for (Pet pet : petList) {
//            System.out.println(pet.speak());
//        }
        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);
        //error
        //pettablePets.add(scorpion);
        pettablePets.add(frog);
        pettablePets.add(hamster);
        //error
        //pettablePets.add(snake);

//        for (Pettable pettablePet : pettablePets){
//            pettablePet.pet();
//        }
    }
}