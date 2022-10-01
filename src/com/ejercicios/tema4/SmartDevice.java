package com.ejercicios.tema4;

public class SmartDevice {

    //atributos

    String conectividad;
    int bateriaMax;

    int bateriaActual;
    boolean encendido;

    //constructores

    public SmartDevice() {

    }

    public SmartDevice(String conectividad, int bateriamax, int bateriaactual, boolean encendido) {
        this.conectividad = conectividad;
        this.bateriaMax = bateriamax;
        this.encendido= encendido;
        this.bateriaActual = bateriaactual;


    }

    //métodos

    public void encender(){
        this.encendido = true;

    }

    public void apagar(){
        this.encendido = false;

    }

    public void printOnOff () {
        if (this.encendido == true) {
            System.out.println( "está encendido");
        } else {
            System.out.println("está apagado");}
    }


    public int cargar (int carga) {
        return this.bateriaActual += carga;
    }


}

