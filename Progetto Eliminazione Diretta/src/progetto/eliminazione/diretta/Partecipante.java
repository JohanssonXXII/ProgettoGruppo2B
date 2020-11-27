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
    String nome;
    String cognome;
    int testadiserie;

    public Partecipante(String nome, String cognome, int testadiserie) {
        this.nome = nome;
        this.cognome = cognome;
        this.testadiserie = testadiserie;
    }
    
    

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getTestadiserie() {
        return testadiserie;
    }

    @Override
    public String toString() {
        return "Partecipante{" + "nome=" + nome + ", cognome=" + cognome + ", testadiserie=" + testadiserie + '}';
    }
}
