package co.tiv.menu.app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hernan on 28/08/16.
 */
public class Archivos {
    List <String> arrayLineasArchivo = new ArrayList<String>();
    boolean posibleGuardarArchivo = false;
    String rutaArchivo ="usuarios.txt";


    public void leerArchivoPlano(){
        arrayLineasArchivo.clear();
        BufferedReader archivoLeer = null;
        try{
            archivoLeer = new BufferedReader(new FileReader(rutaArchivo));
            while (archivoLeer.ready()){
               String linea = archivoLeer.readLine();
                arrayLineasArchivo.add(linea);
            }
            archivoLeer.close();
            setPosibleGuardarArchivo(true);
            mostrarContenidoArchivo();

        }catch (FileNotFoundException fnfe){
            System.out.printf("%n%s %s.","No se pudo encontrar el archivo",rutaArchivo);
        }catch (Exception e){
            System.out.printf("%n%s %s.","Se ha presentado un error.", e.getMessage());
        }
    }

    public void guardarArchivoPlano(){
        if (posibleGuardarArchivo) {
            File miDir = new File(".");
            try {
                BufferedWriter archivoEscribir = new BufferedWriter(new FileWriter("copia de " + rutaArchivo));
                System.out.printf("%n%s. %s","array tiene: ", arrayLineasArchivo.size());
                for (String linea : arrayLineasArchivo) {
                    archivoEscribir.write (linea + "\r\n");
                }
                System.out.printf("%n%s.","El archivo a sido guardado correctamente");
                archivoEscribir.close();
            } catch (IOException e) {
                System.out.printf("%n%s. %s","Se presentó un error");
            }
        }else{
            System.out.printf("%n%s.","El archivo no ha sido leido, no es posible guardar su contenido");
        }

    }

    public void mostrarContenidoArchivo(){
        System.out.printf("%n-%s.","Contenido del archivo");
        for (String linea:arrayLineasArchivo){
            System.out.printf("%n%s",linea);
        }
    }

    public boolean isPosibleGuardarArchivo() {
        return posibleGuardarArchivo;
    }

    public void setPosibleGuardarArchivo(boolean posibleGuardarArchivo) {
        this.posibleGuardarArchivo = posibleGuardarArchivo;
    }
}
