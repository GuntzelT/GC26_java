package com.cybertron.autobot;

/**
 * Representa um Autobot da base.
 */
public class Autobot {

    private String nomeAutobot;
    private double energon;
    private int nivelEnergon;

    public Autobot(String nomeAutobot, double energon, int nivelEnergon) {
        this.nomeAutobot = nomeAutobot;
        this.energon = energon;
        this.nivelEnergon = nivelEnergon;
    }

    public String getNomeAutobot() {
        return nomeAutobot;
    }

    public void setNomeAutobot(String nomeAutobot) {
        this.nomeAutobot = nomeAutobot;
    }

    public double getEnergon() {
        return energon;
    }

    public void setEnergon(double energon) {
        this.energon = energon;
    }

    public int getNivelEnergon() {
        return nivelEnergon;
    }

    public void setNivelEnergon(int nivelEnergon) {
        this.nivelEnergon = nivelEnergon;
    }
}