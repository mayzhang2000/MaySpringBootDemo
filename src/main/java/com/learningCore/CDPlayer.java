package com.learningCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mayz985 on 9/14/17.
 */
@Component
public class CDPlayer {
    @Autowired
    CD cd;
    public void play() {
        System.out.println("insicd CDPlayer");
        cd.play();
    }
}
