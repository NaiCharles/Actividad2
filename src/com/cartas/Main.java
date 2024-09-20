package com.cartas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando el programa...");

        Deck mazo = new Deck();

        mazo.mezclar();

        mazo.mostrarPrimera();

        mazo.seleccionarAlAzar();

        mazo.repartirMano();
    }
}
