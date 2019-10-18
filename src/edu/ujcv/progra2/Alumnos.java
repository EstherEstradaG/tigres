package edu.ujcv.progra2;

//pojo
public class Alumnos {
    private String name;
    private String numeroCuenta;


    public Alumnos(String name, String numeroCuenta) {
        this.name = name;
        this.numeroCuenta = numeroCuenta;
    }

    public Alumnos() {

    }

    public String toString() {
        return name + ",\t" + numeroCuenta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}