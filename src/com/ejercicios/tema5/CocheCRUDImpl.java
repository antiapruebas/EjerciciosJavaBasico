package com.ejercicios.tema5;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("guardar");
    }

    @Override
    public void delete() {
        System.out.println("borrar");
    }

    @Override
    public void findAll() {
        System.out.println( "muestra todos");

    }
}
