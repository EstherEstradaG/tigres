package edu.ujcv.progra2;

import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.*;
import java.util.ArrayList;

public class AlumnosModel {

    private ArrayList<Alumnos> alumnos;

    public ArrayList<Alumnos> getAlumnos(){
        return alumnos;
    }

    AlumnosModel(){
        alumnos = new ArrayList<>();
        try {
            leerArchivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void  leerArchivo() throws IOException {
        File file = new File("superData.csv");
        FileReader fileReader = new FileReader(file);

        CsvPreference.Builder builder = new CsvPreference.Builder('\'',',',"\n");
        CsvBeanReader beanReader = new CsvBeanReader(fileReader,CsvPreference.STANDARD_PREFERENCE);

        final String[] header = beanReader.getHeader(true);
        final CellProcessor[] processors = new CellProcessor[] {
                new NotNull(), // nombre
                new NotNull(), // cuenta
        };

        Alumnos alumno = null;

        while ((alumno = beanReader.read(Alumnos.class,header,processors))
                != null){
            alumnos.add(alumno);
        }

        beanReader.close();
        fileReader.close();
        file = null;
    }

    public void createAlumno(String nombre, String numeroCuenta){
        alumnos.add(new Alumnos(nombre, numeroCuenta));
    }

    public void updateAlumno(int index,String nombre,String numeroCuenta){
        alumnos.set(index,new Alumnos(nombre,numeroCuenta));
    }

    public void deleteAlumno(int index){
        alumnos.remove(index);
    }

    public ArrayList<Alumnos> readAlumnos(int start, int end){
        return null;
    }

    public Alumnos readAlumno(int index){
        System.out.println(alumnos.get(index));
        return null;
    }

    public void persist(){

    }

}
