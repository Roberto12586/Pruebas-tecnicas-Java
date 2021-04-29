package Ejercicio_2;
import java.io.*;
/**
 *
 * @author Roberto
 */
public class ficherotextoescribir {
    public static void main(String[] arg) throws IOException {
        FileWriter fichero= new FileWriter("datos.txt");
                fichero.write("Esto es el texto de roberto prado");
                fichero.close();

       
    
    }  
}
