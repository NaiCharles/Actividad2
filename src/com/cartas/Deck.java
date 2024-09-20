package com.cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cartas;

    public Deck() {
        cartas = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] colores = {"Rojo", "Rojo", "Negro", "Negro"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < palos.length; i++) {
            for (String valor : valores) {
                cartas.add(new Card(palos[i], colores[i], valor));
            }
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void mostrarPrimera() {
        if (!cartas.isEmpty()) {
            Card primera = cartas.remove(0);
            System.out.println(primera);
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay cartas en el deck.");
        }
    }

    public void seleccionarAlAzar() {
        if (!cartas.isEmpty()) {
            int indiceAleatorio = (int) (Math.random() * cartas.size());
            Card seleccionada = cartas.remove(indiceAleatorio);
            System.out.println(seleccionada);
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay cartas en el deck.");
        }
    }

    public void repartirMano() {
        if (cartas.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card carta = cartas.remove(0);
                System.out.println(carta);
            }
            System.out.println("Quedan " + cartas.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas para repartir una mano.");
        }
    }
}
