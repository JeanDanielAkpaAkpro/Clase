package piedra.papel.tijera;

import java.time.LocalTime;
import java.util.Scanner;

public class PiedraPapelTijera {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        int eleccion;
        int eleccionprimerjugador;
        int eleccionsegundojugador;
        String nombreprimerjugador;
        String nombresegundojugador;
        
        do{
            int marcadorusuario=0;
            int marcadormaquina=0;
            int marcadorprimerjugador=0;
            int marcadorsegundojugador=0;
            int numerorandom;
            
            String hora = (LocalTime.now()).toString();
            String[] hora_actual = hora.split(":");
            System.out.println("      PIEDRA,PAPEL O TIJERA    " + hora_actual[0] + ":" + hora_actual[1]);
            
            System.out.println("------------------------------------");
            System.out.println("1.Jugar contra la maquina al mejor de 5");
            System.out.println("2.Jugar 2 personas");
            System.out.println("3.Salir");
            menu= entrada.nextInt();
            switch(menu){
                case 1 -> {
                    for(int i=0;i<5;i++){
                        numerorandom=(int) (Math.random()*3+1);
                        String hora1 = (LocalTime.now()).toString();
                        String[] hora_actual1 = hora1.split(":");
                        System.out.println("    PIEDRA,PAPEL O TIJERA CONTRA LA IA    " + hora_actual1[0] + ":" + hora_actual1[1]);
            
                        System.out.println("----------------------------------------");
                        System.out.println("1.Para sacar piedra");
                        System.out.println("2.Para sacar papel");
                        System.out.println("3.Para sacar tijera");
                        eleccion = entrada.nextInt();
                        
                        
                        //Piedra Usuario
                        if(eleccion==1 && numerorandom==1){
                            System.out.println("Has sacado piedra y la maquina ha sacado piedra asi que empate");
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                            i=i-1;
                        }
                        if(eleccion==1 && numerorandom==2){
                            System.out.println("Has sacado piedra y la maquina ha sacado papel asi que gana la maquina ");
                            marcadormaquina = marcadormaquina +1;
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                        }
                        if(eleccion==1 && numerorandom==3){
                            System.out.println("Has sacado piedra y la maquina ha sacado tijeras asi que ganas");
                            marcadorusuario = marcadorusuario + 1;
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                        }
                        //Papel Usuario
                        if(eleccion==2 && numerorandom==1){
                            System.out.println("Has sacado papel y la maquina ha sacado piedra por lo que ganas");
                            marcadorusuario = marcadorusuario + 1;
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                        }    
                        if(eleccion==2 && numerorandom==2){
                            System.out.println("Has sacado papel y la maquina ha sacado tambien papel por lo que empate");
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                            i=i-1;
                        }
                        if(eleccion==2 && numerorandom==3){
                            System.out.println("Has sacado papel y la maquina ha sacado tijeras por lo que gana la maquina");
                            marcadormaquina = marcadormaquina + 1;
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                        }
                        //Tijera Uusuario
                        if(eleccion==3 && numerorandom==1){
                            System.out.println("Has sacado tijera y la maquina ha sacado piedra asi que gana la maquina");
                            marcadormaquina = marcadormaquina + 1;
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                        }
                        if(eleccion==3 && numerorandom==2){
                            System.out.println("Has sacado tijera y la maquina ha sacado papel por lo que ganas");
                            marcadorusuario = marcadorusuario + 1;
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                        }
                        if(eleccion==3 && numerorandom==3){
                            System.out.println("Has sacado tijera y la maquina tambien asi que empate");
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                            i=i-1;
                        }
                        if(marcadorusuario==3){
                            System.out.println("Ha ganado el usuario!!!!!");
                            System.out.println("Marcador: Usuario[" + marcadorusuario + "]" + "-" + "[" + marcadormaquina + "] IA");
                            break;
                        }
                        if(marcadormaquina==3){
                            System.out.println("Ha ganado la IA, suerte la proxima vez...");
                            for(int x=0; x<5; x++){
                            System.out.println("");
                            }
                            break;
                        }
                        
                    }
                    
                        
                    
                    
                }
                case 2 -> { 
                    System.out.println("Introduzca el nombre del jugador 1 en mayusculas: ");
                    nombreprimerjugador = entrada.next();
                    System.out.println("Introduzca el nombre del jugador 2 en mayusculas: ");
                    nombresegundojugador = entrada.next();
                    for(int i=0;i<5;i++){
                        String hora2 = (LocalTime.now()).toString();
                        String[] hora_actual2 = hora2.split(":");
                        
                        System.out.println("    PIEDRA,PAPEL O TIJERA 2 JUAGDORES    " + hora_actual2[0] + ":" + hora_actual2[1]);
                        System.out.println("          ElECCION " + nombreprimerjugador +"    ");
            
                        System.out.println("----------------------------------------------");
                        System.out.println("1.Para sacar piedra");
                        System.out.println("2.Para sacar papel");
                        System.out.println("3.Para sacar tijera");
                        eleccionprimerjugador = entrada.nextInt();
                        
                        for(int x=0; x<50; x++){
                            System.out.println("");
                        }
                        
                        System.out.println("    PIEDRA,PAPEL O TIJERA 2 JUGADORES    " + hora_actual2[0] + ":" + hora_actual2[1]);
                        System.out.println("          ElECCION " + nombresegundojugador +"    ");
            
                        System.out.println("----------------------------------------------");
                        System.out.println("1.Para sacar piedra");
                        System.out.println("2.Para sacar papel");
                        System.out.println("3.Para sacar tijera");
                        eleccionsegundojugador = entrada.nextInt();
                        
                        //Piedra Primer Jugador
                        if(eleccionprimerjugador==1 && eleccionsegundojugador==1){
                            System.out.println(nombreprimerjugador  +" ha sacado piedra y " + nombresegundojugador + " ha sacado piedra asi que empate");
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                            i=i-1;
                        }
                        if(eleccionprimerjugador==1 && eleccionsegundojugador==2){
                            System.out.println(nombreprimerjugador + " ha sacado piedra y " + nombresegundojugador + " ha sacado papel asi que gana " + nombresegundojugador);
                            marcadorsegundojugador = marcadorsegundojugador +1;
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                        }
                        if(eleccionprimerjugador==1 && eleccionsegundojugador==3){
                            System.out.println(nombreprimerjugador + " ha sacado piedra y " + nombresegundojugador + " ha sacado tijeras asi que gana " + nombreprimerjugador);
                            marcadorprimerjugador = marcadorprimerjugador + 1;
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                        }
                        //Papel Primer Jugador
                        if(eleccionprimerjugador==2 && eleccionsegundojugador==1){
                            System.out.println(nombreprimerjugador + " ha sacado papel y " + nombresegundojugador + " ha sacado piedra por lo que gana " + nombreprimerjugador);
                            marcadorprimerjugador = marcadorprimerjugador + 1;
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                        }    
                        if(eleccionprimerjugador==2 && eleccionsegundojugador==2){
                            System.out.println(nombreprimerjugador + " ha sacado papel y " + nombresegundojugador + " ha sacado tambein papel por lo que empate");
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                            i=i-1;
                        }
                        if(eleccionprimerjugador==2 && eleccionsegundojugador==3){
                            System.out.println(nombreprimerjugador + " ha sacado papel y " + nombresegundojugador + " ha sacado tijeras por lo que gana " + nombresegundojugador);
                            marcadorsegundojugador = marcadorsegundojugador + 1;
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                        }
                        //Tijera Primer JUgador
                        if(eleccionprimerjugador==3 && eleccionsegundojugador==1){
                            System.out.println(nombreprimerjugador + " ha sacado tijera y " + nombresegundojugador + " ha sacado piedra asi que gana " + nombresegundojugador);
                            marcadorsegundojugador = marcadorsegundojugador + 1;
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                        }
                        if(eleccionprimerjugador==3 && eleccionsegundojugador==2){
                            System.out.println(nombreprimerjugador + " ha sacado tijera y " + nombresegundojugador +" ha sacado papel por lo que gana " + nombreprimerjugador);
                            marcadorprimerjugador = marcadorprimerjugador + 1;
                            System.out.println("Marcador: " + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                        }
                        if(eleccionprimerjugador==3 && eleccionsegundojugador==3){
                            System.out.println(nombreprimerjugador   + " ha sacado tijera y el " + nombresegundojugador + " tambien asi que empate");
                            System.out.println("Marcador:" + nombreprimerjugador + "[" + marcadorprimerjugador + "]" + "-" + "[" + marcadorsegundojugador + "] " + nombresegundojugador);
                            i=i-1;
                        }
                        if(marcadorprimerjugador==3){
                            System.out.println("Ha ganado " + nombreprimerjugador + "!!!!!");
                            for(int x=0; x<5; x++){
                                System.out.println("");
                            }
                            break;
                        }
                        if(marcadorsegundojugador==3){
                            System.out.println("Ha ganado " + nombresegundojugador + "!!!!!");
                            for(int x=0; x<5; x++){
                                System.out.println("");
                            }
                            break;
                        }
                        
                    }
                }
                    
            }
        }while(menu!=3);
        
    }
    
}
