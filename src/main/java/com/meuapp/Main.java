package com.meuapp;

import com.meuapp.singleton.Singleton;
import com.meuapp.strategy.Addition;
import com.meuapp.strategy.Context;
import com.meuapp.strategy.Subtraction;
import com.meuapp.facade.Amplifier;
import com.meuapp.facade.DvdPlayer;
import com.meuapp.facade.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        // Teste Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Teste Strategy
        Context context = new Context(new Addition());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Subtraction());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        // Teste Facade
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd);

        homeTheater.watchMovie("Interstellar");
        homeTheater.endMovie();
    }
}