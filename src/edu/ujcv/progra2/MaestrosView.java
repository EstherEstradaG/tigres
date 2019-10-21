package edu.ujcv.progra2;

import java.util.ArrayList;
import java.util.Scanner;

public class MaestrosView {
    void presentarMenuMaestros(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Menu Maestros!");
        System.out.println("1. ver Maestros");
        System.out.println("2. agregar Maestro");
        System.out.println("3. eliminar Maestro");
        System.out.println("4. modificar Maestro");
        System.out.println("5. Eliminar todo el contenido del archivo");
        System.out.println("0.salir");
        System.out.println("ingrese su opcion");

    }

    void pedirNombre(){
        System.out.println("ingrese el Nombre");
    }

    public MaestrosView() {
    }

    void pedirClase(){
        System.out.println("ingrese la catedra que imparte");
    }

    void verLista(ArrayList<Maestros> maestros){
        System.out.println("\t\tMaestros:");
        System.out.println("#,\tnombre, \tclasses");
        int i = 1;
        for (Maestros maestro : maestros){
            System.out.println(""+(i++)+"\t"+maestro);
        }
    }
}
