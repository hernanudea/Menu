package co.tiv.menu.app;

/**
 * Created by hernan on 27/08/16.
 */
public class Utiles {

    public static int validarOpcion(String texto) {
        try {
            int opcion = Integer.parseInt(texto);
            return opcion;
        }catch (NumberFormatException nfe){
            return 1000;
        }
    }

}
