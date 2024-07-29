package com.meuapp.facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd) {
        this.amp = amp;
        this.dvd = dvd;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvd.off();
        amp.off();
    }
}