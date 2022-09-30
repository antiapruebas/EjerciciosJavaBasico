package com.ejercicios.tema3;

public class EjercicioT3 {

    public static void main(String[] args) {

        String[] amigos = {"Paco", "David", "Mario", "Juan"};
        System.out.print("Mis amigos son ");
        for (int i = 0; i < amigos.length; i++) {
            System.out.print(amigos[i]);

            if (i < amigos.length - 2) {
                System.out.print(", ");

            } else if (i == amigos.length - 2) {
                System.out.print(" y ");

            } else {
                System.out.print(".");

            }

        }
    }
}







