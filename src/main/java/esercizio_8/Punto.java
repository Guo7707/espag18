/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_8;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */

/*
   Salve a tutti!, questo programma definisce una classe Punto che permette di
   individuare un punto nel piano cartesiano, calcolando la sua distanza dall’
   origine.
 */
public class Punto {
    
    //Istanza della classe Scanner
    Scanner scanner = new Scanner(System.in);
    //Lettura dell'input inserito dall'utente e assegnazione all'attributo "x".
    double x = scanner.nextDouble();
    //Lettura dell'input inserito dall'utente e assegnazione all'attributo "y".
    double y = scanner.nextDouble();
    public void stampa(){
        System.out.println("Il punto si trova nelle coordinate:");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
    public static void main(String[] args) {
        //Stampa della richiesta di input
        System.out.println("Inserire prima il valore della x e poi il valore della y!!:");
        Punto oggetto = new Punto();
        oggetto.stampa();
    }
}
