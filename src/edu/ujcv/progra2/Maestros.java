package edu.ujcv.progra2;

import java.util.ArrayList;

public class Maestros {
    private String name;
    private String classes;

    public Maestros(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Maestros() {

    }

    public String toString() {

        return name + ",\t" + classes;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getClase() {

        return classes;
    }

    public void setClase(String classes){
        this.classes = classes;
    }
}

