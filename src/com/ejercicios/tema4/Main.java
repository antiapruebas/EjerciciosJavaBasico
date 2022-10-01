package com.ejercicios.tema4;

public class Main {
    public static void main(String[] args) {


        System.out.println("Dispositivo:");

 SmartDevice dispositivo = new SmartDevice( "bluetooth", 2000,100,  false);

        System.out.println(dispositivo.conectividad);

        dispositivo.printOnOff();

        dispositivo.encender();

        dispositivo.printOnOff();

        dispositivo.cargar(300);

        System.out.println(dispositivo.bateriaActual);


        System.out.println("Teléfono:");


        SmartPhone galaxyH = new SmartPhone(8, "4G", "vodafone", "wifi", 5000, 2500, true);

        System.out.println(galaxyH.bateriaActual);
        galaxyH.cargar(200);
        System.out.println(galaxyH.bateriaActual);


        System.out.println(galaxyH.operador);
        galaxyH.portabilidad("orange");
        System.out.println(galaxyH.operador);


        System.out.println("Reloj:");
        SmartWatch relojito= new SmartWatch("Cuadrada",24,1,200,10);

        relojito.ampm();
        System.out.println(relojito.formatohora);


        System.out.println(relojito.versión);
        relojito.actualizar();
        System.out.println(relojito.versión);
        relojito.cargar(10);











    }
}

