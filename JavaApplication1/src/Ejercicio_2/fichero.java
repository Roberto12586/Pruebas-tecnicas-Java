package Ejercicio_2;
import java.io.*;
import Ejercicio_2.ficherotextoescribir;
import Ejercicio_2.ficherotextoleer;
/**
 *
 * @author Roberto
 */
public class fichero {

    public static void main(String[] arg) {

        String archivo1 = "datos.txt";
        File archivo = new File(archivo1);

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println(archivo.getName() + " Creado");

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
