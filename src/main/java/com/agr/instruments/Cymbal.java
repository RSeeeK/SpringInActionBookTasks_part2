package com.agr.instruments;

import com.agr.annotation.qualifiers.StringedInstrument;


@StringedInstrument
public class Cymbal implements Instrument{
    public Cymbal() {
    }

    public void play() {
        System.out.println("TISH TISH TISH");
    }
}
