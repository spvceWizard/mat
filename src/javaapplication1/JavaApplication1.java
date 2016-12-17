/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author komputer-1
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 
        Osoba osoba = new Osoba();
        osoba.imie = "Jan" ;
        osoba.nazwisko = "kowalski" ;
        osoba.pensja = 1200 ; 
    
        osoba.wyświetl();
       
    }
}

