package edu.ujcv.progra2;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosView {

    void presentarMenuAlumnos(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Menu Alumnos!");
        System.out.println("1. ver alumnos");
        System.out.println("2. agregar alumno");
        System.out.println("3. eliminar alumno");
        System.out.println("0.salir");
        System.out.println("ingrese su opcion");

    }

    void pedirNombre(){
        System.out.println("ingrese el Nombre");
    }

    public AlumnosView() {
    }

    void pedirNumeroDeCuenta(){
        System.out.println("ingrese el numero de cuenta");
    }

    void verLista(ArrayList<Alumnos> alumnos){
        System.out.println("\t\tAlumnos:");
        System.out.println("#,\tnombre, \tnumero de Cuenta");
        int i = 1;
        for (Alumnos alumno : alumnos){
            System.out.println(""+(i++)+"\t"+alumno);
        }
    }
}
