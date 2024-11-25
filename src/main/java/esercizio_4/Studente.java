/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_4;

/**
 *
 * @author Lombardo Guido
 */

/*
   Salve a tutti!, questo programma definisce una classe Studente per 
   rappresentare oggetti studente con il cognome, il nome, il codice fiscale,
   il numero di matricola e con opportuni metodi d’istanza tra cui un metodo 
   del tipo String toString() per la sua descrizione.
 */
public class Studente {
//Dichiarazione degli attributi
    private String Cognome;
    private String Nome;
    private String CodiceFiscale;
    private int NumeroMatricola;
    
    //Creazione metodo di stampa
    public void StampaStudente1() {
        //Stampa attributi di studente1
        System.out.println("Stampa attributi di studente1");
        System.out.println("Cognome:" + Cognome);
        System.out.println("Nome:" + Nome);
        System.out.println("CodiceFiscale:" + CodiceFiscale);
        System.out.println("NumeroMatricola:" + NumeroMatricola);
    }

    //Creazione metodo di stampa
    public void StampaStudente2() {
        //Stampa attributi di studente2
        System.out.println("Stampa attributi di studente2");
        System.out.println("Cognome:" + Cognome);
        System.out.println("Nome:" + Nome);
        System.out.println("CodiceFiscale:" + CodiceFiscale);
        System.out.println("NumeroMatricola:" + NumeroMatricola);
    }

    public static void main(String[] args) {
        //Creazione oggetto "studente1"
        Studente studente1 = new Studente();
        //Assegnazione del valore agli attributi dell'oggetto
        studente1.Cognome = "Bianchi";
        studente1.Nome = "Marco";
        studente1.CodiceFiscale = "BNCMRC03H13F205O";
        studente1.NumeroMatricola = 498711;
        //Richiamo del metodo di stampa
        studente1.StampaStudente1();
        //Creazione oggetto "studente2"
        Studente studente2 = new Studente();
        //Assegnazione del valore agli attributi dell'oggetto
        studente2.Cognome = "Verdi";
        studente2.Nome = "Francesco";
        studente2.CodiceFiscale = "VRDFNC04S30A944M";
        studente2.NumeroMatricola = 743912;
        //Richiamo del metodo di stampa
        studente2.StampaStudente2();

    }
}

