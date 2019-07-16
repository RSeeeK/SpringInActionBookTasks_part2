package com.agr.instruments;

import org.springframework.stereotype.Component;

public class Harmonica implements Instrument {

    public Harmonica() {
    }

    public void play() {
        System.out.println("PRIAM PRIAM PRIAM");
    }
}
