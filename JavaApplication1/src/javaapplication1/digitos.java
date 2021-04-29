package javaapplication1;

import java.util.Random;

public class digitos {

   
    public static void main(String[] args) {
        int num;
        //num= (int) (Math.random()*(9999-0));
        //System.out.println(num);
        
        Random random=new Random();
        num = random.nextInt(10000);
        System.out.println(num);
        
        System.out.println("El numero " + num + " tiene " + Integer.toString(num).length() + " digitos");
        
        
    }
    
}
