package edu.ujcv.progra2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class MaestrosModel {

//Representa el modelo.


        private ArrayList<Maestros> maestros;

        public ArrayList<Maestros> getMaestros(){
            return maestros;
        }

        MaestrosModel(){
            maestros = new ArrayList<>();
            try {
                leerArchivo();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void  leerArchivo() throws IOException {
            File f = new File("superData_1.csv");
            FileReader fileReader = new FileReader(f);

            CsvPreference.Builder builder = new CsvPreference.Builder('\'',',',"\n");
            CsvBeanReader beanReader = new CsvBeanReader(fileReader,CsvPreference.STANDARD_PREFERENCE);

            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = new CellProcessor[] {
                    new NotNull(), // name
                    new NotNull(), // classes
            };

            Maestros maestro = null;

            while ((maestro = beanReader.read(Maestros.class,header,processors))
                    != null){
                maestros.add(maestro);
            }

            beanReader.close();
            fileReader.close();
            f = null;
        }

        public void createMaestro(String name, String classes){
            maestros.add(new Maestros(name, classes));
        }

        public void updateMaestro(int index,String name,String classes){
            maestros.set(index, new Maestros(name, classes));
        }

        public ArrayList<Maestros> readMaestro(int start, int end){
            return null;
        }

        public Maestros readMaestro(int index){
            System.out.println(maestros.get(index));
            return null;
        }

        public void deleteMaestro(int index) {
            maestros.remove(index);


    }
    }


