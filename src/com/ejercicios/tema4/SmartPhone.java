package com.ejercicios.tema4;

public class SmartPhone extends SmartDevice {

    int pantallap;
    String cobertura;
    String operador;

    // Constructores

   public SmartPhone() {

    }

    public SmartPhone( int pantallap, String cobertura, String operador, String conectividad, int bateriamax, int bateriaactual, boolean encendido) {
        this.pantallap = pantallap;
        this.cobertura= cobertura;
        this.operador= operador;
        this.conectividad = conectividad;
        this.bateriaMax = bateriamax;
        this.encendido= encendido;
        this.bateriaActual = bateriaactual;
    }

    //Métodos

    public void portabilidad(String newoperador){
       this.operador=newoperador;
    }

}
