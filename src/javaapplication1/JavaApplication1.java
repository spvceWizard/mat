/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

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
                 
        Osoba osoba = new Osoba("Jan","Kowalski",1200);         
        Osoba osoba2 = new Osoba("Waldek","Nowak",2200);
    
        ArrayList <Osoba> osoby = new ArrayList <> ();
        osoby.add (new Osoba ("Jan", "Kowalski", 1200));
         osoby.add (new Osoba ("Waldek", "Nowak", 2200));
                
        for (int indeks = 0; indeks <osoby.size(); indeks++){
            osoby.get(indeks).wyświetl();
        }
      
       
    }
}

