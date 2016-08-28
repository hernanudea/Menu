package co.tiv.menu.app;

import java.io.IOException;

/**
 * Created by hernan on 27/08/16.
 */
public class Main {

    public static void main (String [] args) throws IOException {

        Menu menu = new Menu();

        do{ //ciclo nunca termina, el programa termina con instrucción desd el menú
            menu.mostrarMenu();
        }while(true);
    }
}
