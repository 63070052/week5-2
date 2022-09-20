package com.example.week52;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service

public class SentenceConsumer {
    protected Sentence sentences = new Sentence();
    @RabbitListener(queues = "GoodWordQueue")
    public void addGoodSentence(String s){
        this.sentences.goodSentences.add(s);

        System.out.println("In addGoodSentence Method: "+ sentences.goodSentences);
    }
    @RabbitListener(queues = "BadWordQueue")
    public void addBadSentence(String s){
        this.sentences.badSentences.add(s);
        System.out.println("In addBadSentence Method: "+ sentences.badSentences);
    }

    @RabbitListener(queues = "GetQueue")
    public Sentence getSentencs(){

        return sentences;
    }
}