package com.mycompany.cronometro;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Cronometro {

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner (System.in);
        int menu;
        int cronometro = 0;
        do{
            System.out.println("1. Iniciar cronometro");
            System.out.println("2. Salir");
            menu= entrada.nextInt();
            switch(menu){
                case 1 -> {
                    System.out.println("Cuantos segundos quiere poner de cronometro: ");
                    cronometro = entrada.nextInt();
            
                for(int i=cronometro; i>=0;i--){
                    
                    System.out.println("Cronometro: " + i);
                    TimeUnit.SECONDS.sleep(1);
                    if(i==0){
                        System.out.println("Ha finalizado el cronometro. " );
                    }
                    
                }
        }
                }
            
        }while(menu!=2);
        
    
}
}
