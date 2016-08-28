package co.tiv.menu.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hernan on 27/08/16.
 */
public class Menu {
    Archivos archivo = new Archivos();
    Fibonacci fibonacci = new Fibonacci();
    NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

    public void mostrarMenu() throws IOException {
        String texto="";


        System.out.printf("%n%s%n", "Bienvenidos");
        System.out.printf("%n%s%n", "Por favor selecciona una opción del siguiente Menú");
        System.out.printf("%n-%s.\t%s.", "1", "Mostrar n numeros aleatorios entre dos valores");
        System.out.printf("%n-%s.\t%s.", "2", "Mostrar secuencia de fibinachi hasta n");
        System.out.printf("%n-%s.\t%s.", "3", "Leer un archivo y mostrar su contenido en pantalla");
        if (archivo.isPosibleGuardarArchivo()){
            System.out.printf("%n-%s.\t%s.", "4", "Guardar el archivo leido con la opción anterior");
        }
        System.out.printf("%n-%s.\t%s.", "5", "Guardar en una BBDD la linea ingresada por teclado");
        System.out.printf("%n%n-%s.\t%s.%n\t%s", "0", "Cerrar la aplicación", "_");



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            texto = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.printf("%n%s %s.","Se ha presentado un error.", e.getMessage());
        }

        int opcion= Utiles.validarOpcion(texto);

        switch (opcion){
            case 0:
                System.out.printf("%n%s.%n%s","Muchas gracias por usar esta aplicaión", "Fin de la Ejecución");
                System.exit(0);
            case 1:
                numerosAleatorios.mostrasAleatorios();
                break;
            case 2:
                fibonacci.calcularFibonacci();
            case 3:
                archivo.leerArchivoPlano();
                break;
            case 4:
                archivo.guardarArchivoPlano();
                break;
            case 5:

                break;
            default:
                System.out.printf("%n\t%s.%n","No es una opción valida, intentalo de nuevo");
        }
    }


}
