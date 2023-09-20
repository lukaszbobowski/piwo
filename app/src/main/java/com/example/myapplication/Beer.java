package com.example.myapplication;

public class Beer {
    String name;
    int imadeId;

    public Beer(String name, int imadeId) {
        this.name = name;
        this.imadeId = imadeId;
    }

    public String getName() {
        return name;
    }

    public int getImadeId() {
        return imadeId;
    }
}
