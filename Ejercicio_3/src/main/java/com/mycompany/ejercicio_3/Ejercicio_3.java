/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_3;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio_3 {

    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Horario de entrada.");
        System.out.println(" # Pimero Ingrese la hora y luego los minutos #");
        System.out.print("Ingrese la hora: ");
        int hora = lee.nextInt();

        // Evalua que no supere las 24 horas sino que el maximo sea 23:59
        while( hora > 23){
            System.out.println("----La hora ingresada es incorrecta.----");
            System.out.print("Ingrese la hora nuevamente:");
            hora = lee.nextInt();
        }
        
        
        System.out.print("Ingrese los minutos: ");
        int minutos = lee.nextInt();
        // Evalua que no supere los 59 minutos sino que el maximo sea por ejemplo 15:59,es decir, que no sea por ejemplo 15:64.
        while( minutos > 59){
            System.out.println("----Los minutos ingresados son incorrectos.----");
            System.out.print("Ingrese los minutos nuevamente:");
            minutos = lee.nextInt();
        }
        
        // Le suma las horas o se las resta
        if(hora > 12){
            hora = hora - 12;
        }else{
            hora = hora + 12;
        }
        // Indica si es el horario de salida es AM o PM
        String PMAM;
        if( hora > 11){
           PMAM = "PM";
        }else{
           PMAM = "AM";
        }
        System.out.println("El horario de salida sera: " +hora +":"+minutos +PMAM);
    }
}
