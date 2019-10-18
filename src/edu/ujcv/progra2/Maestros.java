package edu.ujcv.progra2;

public class Maestros {
    private String name;
    private String clase;


    public Maestros(String name, String clase) {
        this.name = name;
        this.clase = clase;
    }

    public Maestros() {

    }

    public String toString() {

        return name + ",\t" + clase;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getClase() {

        return clase;
    }

    public void setClase(String clase) {

        this.clase = clase;
    }
}

