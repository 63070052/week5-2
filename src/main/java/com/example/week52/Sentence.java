package com.example.week52;

import org.springframework.web.bind.annotation.RestController;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

@RestController
public class Sentence implements Serializable {

    public ArrayList<String> badSentences = new ArrayList<>();
    public ArrayList<String> goodSentences = new ArrayList<>();
}
