/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio_2;

/**
 *
 * @author Lombardo Guido
 */

/*
   Salve a tutti!, questo programma crea una classe Prodotto con due metodi 
   costruttori che inizializzino lo stato dell’oggetto, dotato dei seguenti 
   attributi:
    – string proprietario
    – string nomeNegozio
 */
public class Prodotto {

    private String proprietario;
    private String nomeNegozio;

    //Il primo costruttore inizializza con i valori passati come parametri
    public Prodotto(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio;
    }

    //Il secondo costruttore inizializza lo stato dell'oggetto. (in questo caso conosciamo il proprietario ma non il nome del negozio).
    public Prodotto(String proprietario) {
        this.proprietario = proprietario;  
        this.nomeNegozio = "Non specificato";  
    }

    public static void main(String[] args) {
        //Creazione di un oggetto Prodotto con il primo costruttore
        Prodotto p1 = new Prodotto("Guido Lombardo", "Informatic store");
        //Stampa dei valori contenuti nel primo costruttore
        System.out.println("Stampa dei valori contenuti nel primo costruttore");
        System.out.println("Proprietario: " + p1.proprietario);
        System.out.println("Nome Negozio: " + p1.nomeNegozio);

        //Creazione di un oggetto Prodotto con il secondo costruttore
        Prodotto p2 = new Prodotto("Guido Lombardo");
        //Stampa dei valori contenuti nel secondo costruttore
        System.out.println("Stampa dei valori contenuti nel secondo costruttore");
        System.out.println("Proprietario: " + p2.proprietario);
        System.out.println("Nome Negozio: " + p2.nomeNegozio);
    }
}
