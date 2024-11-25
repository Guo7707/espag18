/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_1;

/**
 *
 * @author Lombardo Guido
 */

/*
   Salve a tutti!, questo programma definisce la classe TelefonoCellulare 
   dandone la rappresentazione sia sintetica sia completa.
 */
public class TelefonoCellulare {
    

    //RAPPRESENTAZIONE SINTETICA
    
    
    TelefonoCellulare samsung_A12 = new TelefonoCellulare();
    
    
    //RAPPRESENTAZIONE COMPLETA
    
    
    private double mm_altezza;
    private double mm_larghezza;
    private double mm_spessore;
    private int AnnoFabbricazione;
    private String colore;

    public void accensione() {

    }

    public void spegnimento() {

    }

    public void invioDiSms() {

    }

    public static void main(String[] args) {
        TelefonoCellulare Iphone13 = new TelefonoCellulare();
        Iphone13.mm_altezza = 146.5;
        Iphone13.mm_larghezza = 71.5;
        Iphone13.mm_spessore = 7.65;
        Iphone13.AnnoFabbricazione = 2021;
        Iphone13.colore = "Nero";
    }
}
