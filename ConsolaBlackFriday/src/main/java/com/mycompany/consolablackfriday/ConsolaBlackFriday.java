package com.mycompany.consolablackfriday;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;


class BlackFriday{
        public int id;
        public String nombre;
        public double precio;
    }

class BlackFridayPrecios{
    public double preciohoy;
    public double preciopre;
    public double precioblack;
}

public class ConsolaBlackFriday {
    public static final String ANSI_WHITE = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        BlackFriday[] catalogo= new BlackFriday[15];
        BlackFridayPrecios[] preciodia = new BlackFridayPrecios[15];
        for(int i = 0; i < 15; i++){
            catalogo[i] = new BlackFriday();
        }
        for(int i = 0; i < 15; i++){
            preciodia[i] = new BlackFridayPrecios();
        }
        catalogo[0].id=1;
        catalogo[0].nombre="Televisor LG";
        catalogo[0].precio=190;
        catalogo[1].id=2;
        catalogo[1].nombre="Iphone 14";
        catalogo[1].precio=1229;
        catalogo[2].id=3;
        catalogo[2].nombre="EAFC 24";
        catalogo[2].precio=89.99;
        catalogo[3].id=4;
        catalogo[3].nombre="PlayStation 5";
        catalogo[3].precio=499.99;
        catalogo[4].id=5;
        catalogo[4].nombre="Bufanda Real Zaragoza";
        catalogo[4].precio=17.45;
        catalogo[5].id=6;
        catalogo[5].nombre="Pantalones Cargo Beige Berskha";
        catalogo[5].precio=30.99;
        catalogo[6].id=7;
        catalogo[6].nombre="Champu Swansea Aclarador de pelo";
        catalogo[6].precio=21.99;
        catalogo[7].id=8;
        catalogo[7].nombre="Laptop HP IntelCore";
        catalogo[7].precio=289.99;
        catalogo[8].id=9;
        catalogo[8].nombre="Tienda de Campaña Kechua";
        catalogo[8].precio=54.99;
        catalogo[9].id=10;
        catalogo[9].nombre="Perfume Giorgio Armani";
        catalogo[9].precio=79.99;
        catalogo[10].id=11;
        catalogo[10].nombre="Chaqueton North Face";
        catalogo[10].precio=129.45;
        catalogo[11].id=12;
        catalogo[11].nombre="Pack: 12000 EAFC POINTS";
        catalogo[11].precio=90.45;
        catalogo[12].id=13;
        catalogo[12].nombre="Frasco Flus Flus";
        catalogo[12].precio=6.99;
        catalogo[13].id=14;
        catalogo[13].nombre="Suchard Oreo Blanco";
        catalogo[13].precio=3.99;
        catalogo[14].id=15;
        catalogo[14].nombre="Fresbee";
        catalogo[14].precio=1.99;
        int menu;
        int ordenar;
        int ordenarprecio;
        String fecha = (LocalDate.now()).toString();
        String[] fecha_actual = fecha.split("-");
        
        
        
        
        for(int i = 0; i < 15; i++){
                preciodia[i].preciohoy = catalogo[i].precio;
                preciodia[i].preciopre = catalogo[i].precio + catalogo[i].precio*0.3;
                preciodia[i].precioblack = preciodia[i].preciopre - preciodia[i].preciopre*0.4;
            }
        
        do{
            String hora = (LocalTime.now()).toString();
            String[] hora_actual = hora.split(":");
            System.out.println(ANSI_YELLOW + "            AMAZON        " + hora_actual[0] + ":" + hora_actual[1] + ANSI_RESET);
            
            System.out.println("-------------------------------");
            if("11".equals(fecha_actual[1])){
                if("24".equals(fecha_actual[2])){
                    System.out.println(ANSI_YELLOW + "HOY ES BLACK FRIDAAAAAY" + ANSI_RESET);
                }
            }
            System.out.println("1." + ANSI_YELLOW + "Ver Catalogo" + ANSI_RESET);
            System.out.println("2." + ANSI_YELLOW + "Ver precio de los productos a dia de hoy " + LocalDate.now() + ANSI_RESET);
            System.out.println("3." + ANSI_YELLOW + "Ver precio dia pre " + ANSI_RESET + ANSI_WHITE + "BlackFriday" + ANSI_RESET);
            System.out.println("4." + ANSI_YELLOW + "Ver precio dia del " + ANSI_RESET + ANSI_WHITE +"BlackFriday" + ANSI_RESET);
            System.out.println("5." + ANSI_YELLOW + "Ver todos los precios." + ANSI_RESET);
            System.out.println("6." + ANSI_YELLOW + "Mostrar productos ordenados por precio" + ANSI_RESET);
            System.out.println("7." +ANSI_RED + "Salir" + ANSI_RESET);
            menu= entrada.nextInt();
            
            switch(menu){
                
                case 1 -> {
                    for(int i=0; i<15; i++){
                        System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + catalogo[i].precio + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                    }
                }
                case 2 -> {
                    for(int i=0; i<15; i++){
                        
                    if (!"11".equals(fecha_actual[1])){
                        System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + preciodia[i].preciohoy + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                    } 
                    if ("11".equals(fecha_actual[1])){
                        if(!"23".equals(fecha_actual[2]) && !"24".equals(fecha_actual[2]))
                        System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + preciodia[i].preciohoy + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                        if("23".equals(fecha_actual[2])){
                            System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + preciodia[i].preciopre + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                        }
                        if("24".equals(fecha_actual[2])){
                            System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + preciodia[i].precioblack + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                        }
                        
                    }
                        
       
                        
                    }
                }
                case 3 -> {
                    for(int i=0; i<15; i++){
                        System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[i].preciopre)*100)/100) + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                    }
                }
                case 4 -> {
                    for(int i=0; i<15; i++){
                        System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[i].precioblack)*100)/100) + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                    }
                }
                case 5 -> {
                    for(int i=0; i<15; i++){
                        System.out.println(ANSI_YELLOW + catalogo[i].id + "." + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[i].nombre + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Precio hoy: " + ANSI_RESET + ANSI_GREEN + preciodia[i].preciohoy + ANSI_RESET + ANSI_YELLOW + "/ Precio pre: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[i].preciopre)*100)/100) + ANSI_RESET + ANSI_YELLOW + "/ Precio black friday: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[i].precioblack)*100)/100) + ANSI_RESET);
                        System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                    }
                }
                case 6 -> {
                    System.out.println("1." + ANSI_YELLOW + "Ordenar de forma ascendente" + ANSI_RESET);
                    System.out.println("2." + ANSI_YELLOW + "Ordenar de forma descendente" + ANSI_RESET);
                    ordenar = entrada.nextInt();
                    System.out.println("1." + ANSI_YELLOW + "Ordenar segun el precio de un dia normal" + ANSI_RESET);
                    System.out.println("2." + ANSI_YELLOW + "Ordenar segun el precio del dia pre Black Friday" + ANSI_RESET);
                    System.out.println("3." + ANSI_YELLOW + "Ordenar segun el precio del dia del Black Friday" + ANSI_RESET);
                    ordenarprecio = entrada.nextInt();
                    if(ordenar==1){
                        for(double i = 0; i< 20000;i++){
                        
                            for(int x=0; x<15;x++){
                                if(((double)Math.round((i)*100)/100)==catalogo[x].precio){
                                    System.out.println(ANSI_YELLOW + catalogo[x].id + "." + ANSI_RESET);
                                    System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[x].nombre + ANSI_RESET);
                                    switch (ordenarprecio){
                                        case 1 -> {
                                            System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + catalogo[x].precio + ANSI_RESET);
                                        }
                                        case 2 -> {
                                            System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[x].preciopre)*100)/100) + ANSI_RESET);
                                        }
                                        case 3 -> {
                                            System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[x].preciopre)*100)/100) + ANSI_RESET);
                                        }
                                    }
                                    
                                    System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                            
                                }
                            }
                        i=i-1+0.01;
                        
                        }
                    }
                    if(ordenar==2){
                        for(double i = 2000; i> 0;i--){
                        
                            for(int x=0; x<15;x++){
                                if(((double)Math.round((i)*100)/100)==catalogo[x].precio){
                                    System.out.println(ANSI_YELLOW + catalogo[x].id + "." + ANSI_RESET);
                                    System.out.println(ANSI_YELLOW + "Producto: " + ANSI_RESET + ANSI_WHITE + catalogo[x].nombre + ANSI_RESET);
                                    switch (ordenarprecio){
                                        case 1 -> {
                                            System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + catalogo[x].precio + ANSI_RESET);
                                        }
                                        case 2 -> {
                                            System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[x].preciopre)*100)/100) + ANSI_RESET);
                                        }
                                        case 3 -> {
                                            System.out.println(ANSI_YELLOW + "Precio: " + ANSI_RESET + ANSI_GREEN + ((double)Math.round((preciodia[x].preciopre)*100)/100) + ANSI_RESET);
                                        }
                                    }
                                    System.out.println(ANSI_WHITE + "---------------------------------------" + ANSI_RESET);
                            
                                }
                            }
                        i=i+1-0.01;
                        
                        }
                    }
                }
            }
            
        }while(menu!=7);
        
    }
}
