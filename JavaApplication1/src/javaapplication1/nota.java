
package javaapplication1;

import java.util.Scanner;

public class nota {
    
    double nota1;
    double acu;
    
    Scanner entrada = new Scanner(System.in);
    
    public void IntroducirNotas() {
        System.out.println("Introduce tu nota");
        nota1 = entrada.nextDouble();
        System.out.println(nota1);
    }
    
    public void Mensaje(){
        if (nota1<5){
            System.out.println("Insuficiente");
        }else{
            if(nota1>= 5 && nota1<7){
                System.out.println("Bien");
            }else{
                 if(nota1>= 7 && nota1<9){
                 System.out.println("Notable");
                }else{
                     if(nota1>= 9 && nota1<10){
                 System.out.println("Excelente");    
                     }else{
                         System.out.println("Error en la introducción de nota");
                     }}
            }
        }
   
    
    }
    public static void main(String [] args){
        nota fc = new nota();
        fc.IntroducirNotas();
        fc.Mensaje();
        
    
    
    }
    
    
   
    
}
