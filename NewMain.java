/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculitos;
import java.util.Scanner;
/**
 *
 * @author tarde
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc= new Scanner(System.in);
       String Nombre;
       
       System.out.println("Por favor, elige tu nickname...");
       Nombre = sc.nextLine(); //leer un string
       System.out.println(" Hola " + Nombre + " Vaya nicks que te pones majo xDñ");
        int n;
        double h;
        int i=10;
        int j= 2;
        int resultado = i+j; 
        System.out.println("el resultado es :" + resultado);
       int i1=5;
       int j1=10;
       System.out.println("esto es :" + (i+j));
       

       System.out.println("esto es :" + (i-j)+ "eres un crack!!!" + Nombre);
       System.out.println("esto es :" + (i*j));     
       System.out.println("esto es :" + (i/j));
       i = i + j; 
       i += j;
       System.out.println(i);
    }
    
}
