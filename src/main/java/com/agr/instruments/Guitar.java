package com.agr.instruments;

import com.agr.annotation.qualifiers.StringedInstrument;
import com.agr.annotation.qualifiers.Strummed;


@StringedInstrument
@Strummed
public class Guitar implements Instrument{
    public Guitar() {
    }

    public void play() {
        System.out.println("BRIN BRIN BRIN");
    }

}
