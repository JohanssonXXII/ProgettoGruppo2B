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
public class Partecipante {
    String firstname;
    String lastname;
    int seed;

    public Partecipante(String firstname, String lastname, int seed) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.seed = seed;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSeed() {
        return seed;
    }
    
    
    
    
}
  
