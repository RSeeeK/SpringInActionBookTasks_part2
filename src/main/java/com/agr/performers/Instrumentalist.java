package com.agr.performers;

import com.agr.instruments.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import com.agr.annotation.qualifiers.StringedInstrument;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }


    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    //@Autowired
    //@Qualifier("stringed")
    //@StringedInstrument
    private Instrument instrument;


    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
