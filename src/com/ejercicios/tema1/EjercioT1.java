package com.ejercicios.tema1;

public class EjercioT1 {

    public static void main (String[] args){

        byte numeroByte = 2;
        short numeroShort= 22;
        int numeroInt= 222;
        long numeroLong = 2222;

        System.out.println("Los números enteros son " + numeroByte + ", " + numeroShort + ", " + numeroInt + ", "+ numeroLong);

        float numeroFloat = 1.01f;
        double numeroDouble = 1.01;

        System.out.println( "Los números decimales son " + numeroFloat + " o " + numeroDouble);


        boolean si= true;
        boolean no = false;

        System.out.println("Los booleanos pueden ser "+ si + " o " + no);

        char caracter = 'c';
        String palabra = "palabra";


        System.out.println( "Los textos pueden ser char, un caracter como " + caracter + " o una cadena como una " + palabra);



    }
}
