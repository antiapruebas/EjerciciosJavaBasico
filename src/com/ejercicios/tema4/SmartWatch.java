package com.ejercicios.tema4;

public class SmartWatch extends SmartDevice {

    String esfera;
    int formatohora;
    int version;


    public SmartWatch (){

    }

    public SmartWatch (String esfera, int formatohora, int version, int bateriamax, int bateriaActual){

        this.esfera = esfera;
        this.bateriaMax=bateriamax;
        this.formatohora= formatohora;
        this.version = version;
        this.bateriaActual= bateriaActual;

    }

     int actualizar (){
       return this.version += 1;
    }

    int ampm ( ){
      return this.formatohora= 12;
    }

    int H ( ){
        return this.formatohora= 24;
    }



}
