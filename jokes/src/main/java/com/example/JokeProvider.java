package com.example;

import java.util.Random;

public class JokeProvider {

    public String getJoke(){

        String[] jokes = {"Hilarious joke!", "Okay joke", "Lame joke", "Terrible joke"};

        int index = new Random().nextInt(jokes.length);

        String randomJoke =(jokes[index]);

        return randomJoke;
    }
}
