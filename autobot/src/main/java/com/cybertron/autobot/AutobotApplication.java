package com.cybertron.autobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class AutobotApplication {

	public static void main(String[] args) {

			GerenciadorAutobots gerenciador = new GerenciadorAutobots();

			Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);
			Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);
			Autobot ratchet = new Autobot("Ratchet", 180.0, 7);

			gerenciador.adicionar(optimus);
			gerenciador.adicionar(bumblebee);
			gerenciador.adicionar(ratchet);

			System.out.println("Energon total: " + gerenciador.calcularEnergonTotal());

			Autobot encontrado = gerenciador.buscarNomeAutobot("Bumblebee");
			if (encontrado != null) {
				System.out.println("Encontrado: " + encontrado.getNomeAutobot());
			} else {
				System.out.println("Autobot nao encontrado");
			}

			gerenciador.repararAutobot(ratchet);
			System.out.println("Energon do Ratchet: " + ratchet.getEnergon());
			System.out.println("Classificacao: " + gerenciador.classificarNivelEnergon(ratchet));

	}

}
