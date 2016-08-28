package co.tiv.menu.app;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by hernan on 27/08/16.
 */
public class NumerosAleatorios {
    static List <Integer> enterosAleatorios = new ArrayList<Integer>();

    public static void mostrasAleatorios() {
        String texto ="";
        int cantidad=0;
        int valorMinimo =0;
        int valorMaximo =0;


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("%n%s.\t%n%s","Ingrese la cantidad de numeros aleatorios que desea", "_");
            texto = bufferedReader.readLine();
            cantidad = Utiles.validarOpcion(texto);
            System.out.printf("%n%s.\t%n%s","Ingrese el valor minimo", "_");
            texto = bufferedReader.readLine();
            valorMinimo = Utiles.validarOpcion(texto);
            System.out.printf("%n%s.\t%n%s","Ingrese el valor maximo", "_");
            texto = bufferedReader.readLine();
            valorMaximo = Utiles.validarOpcion(texto);
        } catch (IOException e) {
            System.out.printf("%n%s %s.","Se ha presentado un error.", e.getMessage());
        }
        enterosAleatorios.clear();
        llenarArreglo(cantidad, valorMinimo, valorMaximo);
        System.out.printf("%n%s%n%n",enterosAleatorios);
    }

    private static void llenarArreglo(int cantidad, int minimo, int maximo) {
        for (int i=0; i<cantidad; i++){
            int entero = ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
            //int entero= (int) ((Math.random() * maximo) + 1);
            enterosAleatorios.add(entero);
        }
    }
}
