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
        osoba.Ustaw("Jan","Kowalski",1200);
         
        Osoba osoba2 = new Osoba();
        osoba2.Ustaw("Waldek","Nowak",2200);
    
       osoba.wyświetl ();
       osoba2.wyświetl ();
       
    }
}

