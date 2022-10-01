package com.ejercicios.tema4;

public class SmartWatch extends SmartDevice {

    String esfera;
    int formatohora;
    int versión;


    public SmartWatch (){

    }

    public SmartWatch (String esfera, int formatohora, int versión, int bateriamax, int bateriaActual){

        this.esfera = esfera;
        this.bateriaMax=bateriamax;
        this.formatohora= formatohora;
        this.versión= versión;
        this.bateriaActual= bateriaActual;

    }

     int actualizar (){
       return this.versión+= 1;
    }

    int ampm ( ){
      return this.formatohora= 12;
    }

    int H ( ){
        return this.formatohora= 24;
    }



}
