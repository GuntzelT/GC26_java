package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

/**
 * Gerencia os Autobots da base.
 */
public class GerenciadorAutobots {

    private List<Autobot> lista = new ArrayList<>();
    private static final Integer limiteMaxEnergonPadrao = 500;
    private static Integer limiteMaxEnergonReserva = 200;
    private static Integer energonAdicional = 100;

    public void adicionar(Autobot autobot) {
        this.lista.add(autobot);
    }

    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i < this.lista.size(); i++) {
            total += this.lista.get(i).getEnergon();
        }
        return total;
    }

    public Autobot buscarNomeAutobot(String nomeAutobot) {
        for (Autobot autobot : this.lista) {
            if (autobot.getNomeAutobot().equals(nomeAutobot)) {
                return autobot;
            }
        }
        return null;
    }

    public void repararAutobot(Autobot autobot) {
        try {
            if (autobot.getEnergon() < 0) {
                throw new Exception("Energon negativo");
            }
            autobot.setEnergon(autobot.getEnergon() + energonAdicional);
        } catch (Exception causa) {
            System.out.println("Nao foi possivel reparar o autobot. Causa: " + causa.toString());
        }
    }

    public ClassificacaoEnergon classificarNivelEnergon(Autobot autobot) {
        if (autobot.getEnergon() > limiteMaxEnergonPadrao) {
            return ClassificacaoEnergon.ELITE;
        } else if (autobot.getEnergon() > limiteMaxEnergonReserva && autobot.getEnergon() < limiteMaxEnergonPadrao) {
            return ClassificacaoEnergon.PADRAO;
        } else {
            return ClassificacaoEnergon.RESERVA;
        }
    }
}