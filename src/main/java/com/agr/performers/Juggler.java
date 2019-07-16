package com.agr.performers;

public class Juggler implements Performer {
    public Juggler() {
    }

    private int count;

    public Juggler(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void perform() throws PerformanceException {
        System.out.println("jugg jugg jugg jugg");
    }
}
