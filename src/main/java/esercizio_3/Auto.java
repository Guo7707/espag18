/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_3;

/**
 *
 * @author Lombardo Guido
 */

/*
   Salve a tutti!, questo programma definisce una classe Auto per rappresentare 
   oggetti automobile con il nome della marca, il nome del modello, la targa e
   l’anno di immatricolazione e con opportuni metodi d’istanza tra cui un
   metodo del tipo String toString() per la sua descrizione.
 */
public class Auto {

    //Dichiarazione degli attributi
    private String Marca;
    private String Modello;
    private String Targa;
    private int AnnoImmatricolazione;
    
    //Creazione metodo di stampa
    public void StampaAutomobile1() {
        //Stampa attributi di automobile1
        System.out.println("Stampa attributi di automobile1");
        System.out.println("Marca:" + Marca);
        System.out.println("Modello:" + Modello);
        System.out.println("Targa:" + Targa);
        System.out.println("Anno di immatricolazione:" + AnnoImmatricolazione);
    }

    //Creazione metodo di stampa
    public void StampaAutomobile2() {
        //Stampa attributi di automobile2
        System.out.println("Stampa attributi di automobile2");
        System.out.println("Marca:" + Marca);
        System.out.println("Modello:" + Modello);
        System.out.println("Targa:" + Targa);
        System.out.println("Anno di immatricolazione:" + AnnoImmatricolazione);
    }

    public static void main(String[] args) {
        //Creazione oggetto "automobile1"
        Auto automobile1 = new Auto();
        //Assegnazione del valore agli attributi dell'oggetto
        automobile1.Marca = "Audi";
        automobile1.Modello = "TTs";
        automobile1.Targa = "ET259DL";
        automobile1.AnnoImmatricolazione = 2020;
        //Richiamo del metodo di stampa
        automobile1.StampaAutomobile1();
        //Creazione oggetto "automobile2"
        Auto automobile2 = new Auto();
        //Assegnazione del valore agli attributi dell'oggetto
        automobile2.Marca = "BMW";
        automobile2.Modello = "A1";
        automobile2.Targa = "GB916LM";
        automobile2.AnnoImmatricolazione = 2024;
        //Richiamo del metodo di stampa
        automobile2.StampaAutomobile2();

    }
}
