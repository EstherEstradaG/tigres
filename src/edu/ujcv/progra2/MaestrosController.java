package edu.ujcv.progra2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaestrosController {

        private MaestrosView view;
        private MaestrosModel model;

        public MaestrosController() {
            view = new MaestrosView();
            model = new MaestrosModel();
        }

        void presentarListaMaestros() {
            view.verLista(model.getMaestros());
        }

        void presentMenuObtenerResultadoMaestros() {
            Scanner sc = new Scanner(System.in);
            view.presentarMenuMaestros();
            // obtener opcion
            MaestrosController controller = new MaestrosController();

            int opcion = sc.nextInt();



                switch (opcion) {
                    case 1: {
                        controller.presentarListaMaestros();
                    }
                    break;
                    case 2: {
                        String name = new String();
                        String clase = new String();
                        model.createMaestro(name, clase);
                        controller.presentarListaMaestros();
                        // controller.write();
                        // view.presentarMenuAlumnos();
                        controller.obtenerNombre();
                        controller.obtenerClase();
                    }

                    break;

                    case 3: {
                    int index = sc.nextInt();
                        model.deleteMaestro(index);

                    }
                    break;
                    case 4:{
                        String name = new String();
                        String clase = new String();
                        int index = sc.nextInt();
                        model.updateMaestro(index, name, clase);
                    }
                    case 5: {
                    //controller.Clear();
                    }

                    default: {

                }
            }
        }

        private String obtenerClase() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su numero de cuenta");
            String Clase = sc.next();
            return Clase;
        }

        private String obtenerNombre() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su nombre");
            String name = sc.next();
            return name;
        }
       /* public void Clear(){


            String mensaje = "Se ha limpiado el archivo";
            try (FileWriter writer = new FileWriter("superData.csv");
                 BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(mensaje);

            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

        }
*/
}