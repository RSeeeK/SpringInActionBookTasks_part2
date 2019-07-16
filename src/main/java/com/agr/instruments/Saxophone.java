package com.agr.instruments;

import org.springframework.stereotype.Component;

public class Saxophone implements Instrument {

    public Saxophone() {
    }

    public void play() {
        System.out.print("TOOT TOOT TOOT");
    }
}
