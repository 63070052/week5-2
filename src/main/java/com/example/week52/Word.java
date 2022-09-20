package com.example.week52;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Word {
    public ArrayList<String> badWords = new ArrayList<>();
    public ArrayList<String> goodWords = new ArrayList<>();

    public Word() {
        goodWords.add("happy");
        goodWords.add("enjoy");
        goodWords.add("life");
        badWords.add("fuck");
        badWords.add("olo");
    }
}
