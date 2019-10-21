package edu.ujcv.progra2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos a nuestro portal");
        System.out.println("Tenemos en disposicion tres menus los cuales podra elegir entre ellos");
        System.out.println("Menus disponible");
        System.out.println("1. Menu de Alumnos");
        System.out.println("2. Menu de Maestros");
        int opcion = sc.nextInt();


        if (opcion == 1) {
            AlumnosController ac = new AlumnosController();
            ac.presentMenuObtenerResultado();
        }

        if (opcion == 2) {
             MaestrosController ma = new MaestrosController();
             ma.presentMenuObtenerResultadoMaestros();
        }

    }
}

