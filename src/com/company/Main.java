package com.company;

public class Main {

    public static void main(String[] args) {
        String cadena= "la tEle letaL";
        cadena= cadena.replace(" ", "");
        cadena= cadena.toLowerCase();
        //System.out.println("la cadena es: "+cadena);
        boolean esPalindromo = true;
        for(int i=0;i<cadena.length()/2;i++){
            if(cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)){
                esPalindromo = false;
                break;
            }
        }
        if(esPalindromo){
            System.out.println("La palabra es palindromo");
        }else{
            System.out.println("La palabra no es palindromo");
        }
        System.out.println("Segundo comiinttte");
    }

}