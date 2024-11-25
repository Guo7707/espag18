/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_5;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido
 */

/*
   Salve a tutti!, questo programma definisce una classe Contatore che permette
   di incrementare e decrementare una variabile di una singola unità.
 */
public class Contatore {
    //Istanza della classe Scanner
    Scanner scanner = new Scanner(System.in);
    //Lettura dell'input inserito dall'utente e assegnazione all'attributo "Variabile".
    int Variabile = scanner.nextInt();
    //Creazione del metodo di incremento
    public void incremento() {
        //Calcolo dell'incremento
        Variabile = Variabile + 1;
        //Stampa del risultato
        System.out.println("La variabile incrementata e': " + Variabile);
    }
    //Creazione del metodo di decremento
    public void decremento() {
        //Calcolo del decremento
        Variabile = Variabile - 2;
        //Stampa del risultato
        System.out.println("La variabile decrementata e': " + Variabile);
    }

    public static void main(String[] args) {
        //Stampa della descrizione del programma
        System.out.println("Salve a tutti!, questo programma definisce una classe Contatore che permette  di incrementare e decrementare una variabile di una singola unita'.");
        //Stampa della richiesta di input
        System.out.println("Inserire un valore intero a piacere!!:");
        //Istanza della classe "Contatore"
        Contatore oggetto = new Contatore();
        //Richiamo del metodo di incremento
        oggetto.incremento();
        //Richiamo del metodo di decremento
        oggetto.decremento();
    }
}
