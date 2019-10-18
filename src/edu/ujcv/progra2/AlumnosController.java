package edu.ujcv.progra2;

import java.util.Scanner;

    public class AlumnosController {
        Scanner sc = new Scanner(System.in);
    private AlumnosView view;
    private AlumnosModel model;

    public AlumnosController() {
        view = new AlumnosView();
        model = new AlumnosModel();
    }

    void presentarListaAlumnos() {
        view.verLista(model.getAlumnos());
    }

    void presentMenuObtenerResultado() {

         int opcion;
         do {
             view.presentarMenuAlumnos();
         opcion = sc.nextInt();


            switch (opcion) {
                case 1: {
                    presentarListaAlumnos();
                }
                break;
                case 2: {
                    sc.nextLine();
                    String name = obtenerNombre();
                    String numeroCuenta = obtenernumeroDeCuenta();
                    model.createAlumno(name, numeroCuenta);
                }
                break;
                case 3: {
                    System.out.println("ingrese el indice que desea borrar");
                    int index = sc.nextInt();
                    model.deleteAlumno(index-1);
                }
                break;
                case 4:{
                    int index = sc.nextInt();
                    String nombre = new String();
                    String numeroCuenta = new String();
                    model.updateAlumno(index, nombre, numeroCuenta);
                }break;
                case 5:
                    break;

                default: {
            }
        }
    }while (opcion!= 5);




}

        private String obtenernumeroDeCuenta() {
            System.out.println("Ingrese su numero de cuenta");

            return sc.nextLine();
        }

        private String obtenerNombre() {
            System.out.println("Ingrese su nombre");

            return sc.nextLine();
        }
        }
