package javaapplication1;

import java.util.Random;

public class PruebaCronometro {

	public static void main(String[] args) {
		  
        Cronometro crono= new Cronometro();
        
        
        
        long t1, t2;
        t1 = System.currentTimeMillis();
            
        int num;
      
        Random random=new Random();
        num = random.nextInt(10000);
        System.out.println(num);
        
        System.out.println("El numero " + num + " tiene " + Integer.toString(num).length() + " digitos");
        
        
        t2 = System.currentTimeMillis();
        System.out.println("El cronometro ha marcado "+ crono.tiempoCronometro(t1,t2) +" millisegundos");

}
 
}