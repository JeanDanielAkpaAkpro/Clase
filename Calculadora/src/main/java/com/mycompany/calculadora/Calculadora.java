

package com.mycompany.calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("We are gonna do a calculator that works with two numbers");
        int num1;
        int num2;
        int operacion;
        System.out.println("Introduze the first number: ");
        Scanner nextEscaner = new Scanner(System.in);
        num1= nextEscaner.nextInt();
        System.out.println("1.Summary");
        System.out.println("2.Multiplication");
        System.out.println("3.Rest");
        System.out.println("4.Divide");
        operacion= nextEscaner.nextInt();
        System.out.println("Introduze the second number; ");
        num2= nextEscaner.nextInt();
        
        switch (operacion){
            case 1: {
                System.out.println("La suma es: " + (num1 + num2));
                break;
            }
            case 2: {
                System.out.println("La multiplicacion es: " + (num1 * num2));
                break;
            }
            case 3: {
                System.out.println("La resta es: " + (num1 - num2));
                break;
            }
            case 4: {
                System.out.println("La division es: " + (num1 / num2));
                break;
            }
        }
        
    }
}
