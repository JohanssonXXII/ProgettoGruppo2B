/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto.eliminazione.diretta;

/**
 *
 * @author Aimen
 */
public class Inserimento {
    Partecipante array[];
    
    public Inserimento() {
    }
    
    public boolean inserisci (int posizione,Partecipante partecipante){
        if(array[posizione]==null){
            array[posizione]=partecipante;
            return true;
        }
        return false;
    }
    
    

    

    
    
}
