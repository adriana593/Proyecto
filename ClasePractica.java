/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasepractica;

import java.util.Scanner;


public class ClasePractica {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Entre 0 para salir");
        System.out.println( "Entre 1 para saber si tres numeros forman una Terna Pitagorica");
        System.out.println( "Entre 2 para generar la serie de Fibonacci" );
        int opt;
        do{
          opt= sc.nextInt();
          switch(opt){
              case 0: System.out.println("Hasta la proxima");
                  break;
              case 1: System.out.println("Ingrese los numeros");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c =sc. nextInt();
              System.out.println("Es una Terna Pitagorica:" +Funciones.isTernaPitagorica(a, b, c));
                  break;
              case 2: System.out.println("Ingrese el numero para devolver el termino de la serie de Fibonacci");
                int num = sc.nextInt();
                System.out.println("La suma enesima de la serie de Fibonaci para este termino es:"+Funciones.sumaFibonacci(num));
                  break;
            }  
        }while(opt != 0);
    }
    
}