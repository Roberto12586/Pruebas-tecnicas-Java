package Ejercicio_2;
import java.util.*;
import java.io.*;

/**
 *
 * @author Roberto
 */
public class ficherotextoleer {
      public static void main(String[] arg)throws IOException {{
          
          FileReader fr = new FileReader("datos.txt");
          BufferedReader bf = new BufferedReader(fr);
          String sCadena="";
          


          while ((sCadena = bf.readLine()) != null) {
              String palabra[] = sCadena.split(" ");
              System.out.println("En este ejemplo NO ES un array: \n");
              System.out.println(sCadena);
              
              
            System.out.println("\nEn este ejemplo esta escrito por índice de array: \n");
            for (int i=0; i<palabra.length; i++){
 
                 System.out.println(palabra[i]);
 
               }
          }

         }
      }       
               
}
  
