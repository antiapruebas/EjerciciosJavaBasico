package com.ejercicios.tema5;

public class Main {

    public static void main(String[] args) {

         CocheCRUDImpl Coches = new CocheCRUDImpl(){

        };

        Coches.findAll();
        Coches.save();
        Coches.delete();

    }



}
