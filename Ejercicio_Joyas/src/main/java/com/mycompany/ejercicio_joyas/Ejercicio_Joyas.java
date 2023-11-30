

package com.mycompany.ejercicio_joyas;

import java.util.Scanner;
//import java.util.Random;

 
    class Baterias{
        public String marca;
        public int voltaje;
    }

public class Ejercicio_Joyas{
//public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
//public static final String ANSI_PURPLE = "\u001B[35m";
//public static final String ANSI_CYAN = "\u001B[36m";
//public static final String ANSI_WHITE = "\u001B[37m";
public static final String ANSI_RESET = "\u001B[0m";
    
    
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        Baterias[] Almacenamiento = new Baterias[100];
        int menu;
        int contador;
        contador=0;
        int numextra;
        int opcioneliminar;
        String eliminarmarca;
        int eliminarvoltaje;
        int opcionreemplazar;
        String reemplazarmarca;
        int reemplazarvoltaje;
        int ordenar;
        int buscador;
        
        
        
        do{
            System.out.println(ANSI_BLUE + "1.Acceder al Archivo" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "2.Dar Alta la bateria" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "3.Eliminar archivo" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "4.Modificar archivo" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "5.Ordenar baterias segun voltaje" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "6.Buscar segun el voltaje" + ANSI_RESET);
            System.out.println(ANSI_BLUE +"7.Mostrar bateria aleatoria" + ANSI_RESET);
            System.out.println(ANSI_RED + "8.Salir" + ANSI_RESET);
            
            menu = entrada.nextInt();
            switch (menu){
                case 1:{
                    for(int i=0; i<contador; i++){
                        System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[i].marca + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[i].voltaje + ANSI_RESET);
                        System.out.println("----------------------");
                    }
                    break;
                }
                case 2:{
                    System.out.println(ANSI_BLUE + "Cuantas baterias quiere añadir?: " + ANSI_RESET);
                    numextra = entrada.nextInt();
                    for(int i=0;i<numextra;i++){
                        Almacenamiento[i] = new Baterias();
                        System.out.println(ANSI_BLUE + "Introduzca la marca de la bateria: " + ANSI_RESET);
                        Almacenamiento[i].marca = entrada.next();
                        System.out.println(ANSI_BLUE + "Introduzca el voltaje de la bateria: " +ANSI_RESET);
                        Almacenamiento[i].voltaje =entrada.nextInt();
                        contador++;
                    }
                    break;
                    
                    
                }
                case 3:{
                    System.out.println(ANSI_BLUE + "1.Eliminar Marca" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "2.Eliminar Voltaje" + ANSI_RESET);
                    opcioneliminar=entrada.nextInt();
                    if(opcioneliminar==1){
                        for(int i=0; i<contador; i++){
                        System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[i].marca + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[i].voltaje + ANSI_RESET);
                        System.out.println("----------------------");
                        }
                        System.out.println(ANSI_BLUE + "Escriba la marca que quiere eliminar: " + ANSI_RESET);
                        eliminarmarca=entrada.next();
                        for(int i=0; i<contador;i++){
                            if(eliminarmarca.equals(Almacenamiento[i].marca)){
                                Almacenamiento[i].marca="";
                            }
                        }
                    }
                    if(opcioneliminar==2){
                        for(int i=0; i<contador; i++){
                        System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[i].marca + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[i].voltaje + ANSI_RESET);
                        System.out.println("----------------------");
                        }
                        System.out.println(ANSI_BLUE + "Escriba el voltaje que quiere eliminar: " + ANSI_RESET);
                        eliminarvoltaje = entrada.nextInt();
                        for(int i=0;i<contador;i++){
                            if(eliminarvoltaje==Almacenamiento[i].voltaje){
                                Almacenamiento[i].voltaje=0;
                            }
                        }
                    }
                    break;
                    
                }
                case 4:{
                    System.out.println(ANSI_BLUE + "1.Reemplazr Marca " + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "2.Reemplazar Voltaje " + ANSI_RESET);
                    opcionreemplazar=entrada.nextInt();
                    if(opcionreemplazar==1){
                        for(int i=0; i<contador; i++){
                        System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[i].marca + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[i].voltaje + ANSI_RESET);
                        System.out.println("----------------------");
                        }
                        System.out.println(ANSI_BLUE + "Escribe la marca que quiere reemplazar: " + ANSI_RESET);
                        reemplazarmarca=entrada.next();
                        for(int i=0; i<contador;i++){
                            if(reemplazarmarca.equals(Almacenamiento[i].marca)){
                                System.out.println(ANSI_BLUE + "Introduzca el nuevo nombre de la marca: " + ANSI_RESET);
                                Almacenamiento[i].marca=entrada.next();
                            }
                        }
                    }
                    if(opcionreemplazar==2){
                        for(int i=0; i<contador; i++){
                        System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[i].marca + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[i].voltaje + ANSI_RESET);
                        System.out.println("----------------------");
                        }
                        System.out.println(ANSI_BLUE + "Escriba el voltaje que quiere reemplazar: " + ANSI_RESET);
                        reemplazarvoltaje=entrada.nextInt();
                        for(int i=0; i<contador; i++){
                        if(reemplazarvoltaje==Almacenamiento[i].voltaje){
                            System.out.println(ANSI_BLUE + "Introduzca el nuevo voltaje: " + ANSI_RESET);
                            Almacenamiento[i].voltaje=entrada.nextInt();
                        }
                        }
                        
                    }
                    break;
                }
                case 5: {
                    System.out.println(ANSI_BLUE + "1.Ordenar de forma descendiente" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "2.Ordenar de forma ascendiente" + ANSI_RESET);
                    ordenar = entrada.nextInt();
                    if(ordenar==1){
                        for(int i=100000000;i>0;i--){
                            for(int x=0; x<contador; x++){
                                if(i==Almacenamiento[x].voltaje){
                                    System.out.println(ANSI_GREEN +"La marca de la bateria es: " + Almacenamiento[x].marca + ANSI_RESET);
                                    System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[x].voltaje + ANSI_RESET);
                                    System.out.println("-------------------------");
                                }
                            }
                        }
                    }
                    if(ordenar==2){
                        for(int i=0;i<100000000;i++){
                            for(int x=0; x<contador; x++){
                                if(i==Almacenamiento[x].voltaje){
                                    System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[x].marca + ANSI_RESET);
                                    System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[x].voltaje + ANSI_RESET);
                                    System.out.println("-------------------------");
                                }
                            }
                        }
                    }
                    break;
                }
                case 6:{
                    System.out.println(ANSI_BLUE + "Introduzca el voltaje por el cual quiere buscar su marca: " + ANSI_RESET);
                    buscador = entrada.nextInt();
                    for(int i=0;i<contador;i++){
                        if(buscador==Almacenamiento[i].voltaje){
                            
                        System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[i].marca + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[i].voltaje + ANSI_RESET);
                        System.out.println("----------------------");
                         
                            
                        }
                    }
                    break;
                }
                case 7:{
                   int numerorandom;
                   numerorandom=(int) (Math.random()+contador-1);
                   
                        System.out.println(ANSI_GREEN + "La marca de la bateria es: " + Almacenamiento[numerorandom].marca + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "El voltaje de la bateria es: " + Almacenamiento[numerorandom].voltaje + ANSI_RESET);
                        System.out.println("----------------------");
                    
                }
                break;
                
            }
            
            
            
        }while(menu!=8);
        
        
    }
}
