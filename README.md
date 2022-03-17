# Progra

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
        seleccion();
    }
    public static int sumar(int a, int b){
        return a+b;
    }
    public static int restar(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static double dividir(int a, int b){
        return a/b;
    }

    public static void menu(){
        System.out.println("------------CALCULADORA BASICA------------");
        System.out.println("Seleccione la operacion que desea realizar");
        System.out.println("[1] SUMAR");
        System.out.println("[2] RESTAR");
        System.out.println("[3] MULTIPLICAR");
        System.out.println("[4] DIVIDIR");

    }

    public static void seleccion() {
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
            try {
                switch (opcion) {

                    case 1:
                        System.out.println("Has seleccionado sumar");
                        resultado1();
                        break;
                    case 2:
                        System.out.println("Has seleccionado restar");
                        resultado2();
                        break;
                    case 3:
                        System.out.println("Has seleccionado Multiplicar");
                        resultado3();
                        break;
                    case 4:
                        System.out.println("Has seleccionado dividir");
                        resultado4();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                        entrada.nextInt();
                }
          } catch(Exception e){
            System.out.println("Debes insertar un número");
            entrada.nextInt();
          }
        }
        public static int entrada1() {
            System.out.println("Ingrese el primer numero");
            int a;
            Scanner entrada = new Scanner(System.in);
            a = entrada.nextInt();
            try {
            }catch(InputMismatchException e){
                    System.out.println("Debes insertar un número");
                    entrada.nextInt();
                }
                return (a);

        }
        public static int entrada2(){
        System.out.println("Ingrese el segundo numero");
        int b;
        Scanner entrada=new Scanner(System.in);
        b=entrada.nextInt();
        try {
        }catch(InputMismatchException e){
            System.out.println("Debes insertar un número");
            entrada.nextInt();
        }
        return(b);
        }
    public static void resultado1(){
        System.out.println("El resultado de la suma es: "+sumar(entrada1(), entrada2()));
    }
    public static void resultado2(){
        System.out.println("El resultado de la resta es: "+restar(entrada1(), entrada2()));
    }
    public static void resultado3(){
        System.out.println("El resultado de la Multiplicacion es: "+multiplicar(entrada1(), entrada2()));
    }
    public static void resultado4(){
        System.out.println("El resultado de la Division es: "+dividir(entrada1(), entrada2()));
    }
