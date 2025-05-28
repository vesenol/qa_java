package com.example;

import java.util.List;

public class Cat {
    private final Feline feline;

    public Cat(Feline feline) {
        this.feline = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public int getKittens(int kittensCount) {
        return feline.getKittens(kittensCount);
    }
}
