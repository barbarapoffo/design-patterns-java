package com.meuapp.strategy;

public class Addition implements Strategy {
 
    public int execute(int a, int b) {
        return a + b;
    }
}