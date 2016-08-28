package co.tiv.menu.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hernan on 27/08/16.
 */
public class Fibonacci {

    static List<Integer> fibonacci = new ArrayList<Integer>();

    public void calcularFibonacci(){
        String texto ="";
        int cantidad=0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("%n%s.\t%n%s","Ingrese la cantidad de numeros Fibonacci que desea calcular", "_");
            texto = bufferedReader.readLine();
            cantidad = Utiles.validarOpcion(texto);
        } catch (IOException e) {
            System.out.printf("%n%s %s.","Se ha presentado un error.", e.getMessage());
        }

        fibonacci.clear();
        llenarArreglo(cantidad);
        System.out.printf("%n%s%n%n",fibonacci);
    }

    private void llenarArreglo(int cantidad) {
        int a=1;
        int b=1;
        fibonacci.add(a);
        for (int i=1; i<cantidad;i++){
            fibonacci.add(b);
            int c= b;
            b=b+a;
            a=c;
        }
    }
}
