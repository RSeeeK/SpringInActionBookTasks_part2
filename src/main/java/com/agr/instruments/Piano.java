package com.agr.instruments;

import org.springframework.stereotype.Component;

//@Component
public class Piano implements Instrument {
    public Piano() {
    }

    public void play() {
        System.out.println("PLANK PLANK PLANK");
    }
}
