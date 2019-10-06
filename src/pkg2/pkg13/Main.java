
package pkg2.pkg13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int valor1;
        int valor2;
        String operador;
        System.out.println("CALCULADORA");
        System.out.println("ingrese valor 1:");
        valor1 = entrada.nextByte();
        System.out.println("ingrese OPERADOR(*,/,+,-):");
        operador = entrada.next();
        System.out.println("ingrese valor 2:");
        valor2 = entrada.nextByte();
        System.out.println("El resultado es: ");
        
        switch(operador){
            case "+":
                int suma = valor1+valor2;
                System.out.println(suma);
                break;
            case"-":
                int resta = valor1-valor2;
                System.out.println(resta);
                break;
            case"*":
                int mult = valor1*valor2;
                System.out.println(mult);
                break;
            case"/":
                if(valor2!=0){
                    int div = valor1/valor2;
                    System.out.println(div);
                    break;
                }else{
                System.out.println("No se puede dividir por 0");
                     }
        }
        
    }
    
}
