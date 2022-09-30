package com.ejercicios.tema2;

public class EjercicioT2 {

    public static void main(String[] args) {

        double precioCosa = 10;

        System.out.println(masIva(precioCosa));

    }

    static double masIva (double precio){
        return precio*1.21;

    }
}