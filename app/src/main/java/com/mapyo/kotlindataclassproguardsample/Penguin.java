package com.mapyo.kotlindataclassproguardsample;


public class Penguin {
    private final String name;
    private final int age;
    private final String memo;

    public Penguin(final String name, final int age, final String memo) {
        this.name = name;
        this.age = age;
        this.memo = memo;
    }

    public String getName() {
        return this.name;
    }
}
