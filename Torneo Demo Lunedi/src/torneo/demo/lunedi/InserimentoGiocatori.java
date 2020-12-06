/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo.demo.lunedi;
import java.util.ArrayList;

/**
 *
 * @author Aimen
 */

/**
 * Inserimento giocatori è un brutto esempio di strutturazione di classi.
 * Il fatto stesso che abbia il verbo nel nome indica che non è "veramente" un oggetto
 * L'oggetto si dovrebbe chiamare "Giocatori" e avare al suo interno un metodo "inserimento"
 * così lo tiri via dal main.
 * Lo stesso vale per il salvataggio e il recupero dei dati.
 *
 * Cosa analoga protreste fare per i Partecipanti
 *
 * In generale, state pensando ancora in modo C++. L'oggetto sono i dati, e l'uso dei dati si fa nelle
 * procedure. Negli oggetti, ogni oggetto gestisce tutto quello che lo riguarda, gli oggetti superiori
 * (es: Tabella) gestiscono le INTERAZIONI tra gli oggetti.
 *
 * Provate a tener conto di questo, e riorganizzate anche l'UML in tal senso.
 *
 */

public class InserimentoGiocatori {
    
    protected ArrayList<Partecipante> list;
	
	public InserimentoGiocatori() {
		super();
		this.list = new ArrayList<Partecipante>();
	}
	

	public ArrayList<Partecipante> getList() {
		return list;
	}

	public void setList(ArrayList<Partecipante> list) {
		this.list = list;
	}
    
    public void addParticepant(Partecipante p) {
		list.add(p);
	}

    @Override
    public String toString() {
        return "InserimentoGiocatori{" + "list=" + list + '}';
    }
        
	
	

}
    
    
    
    
    
    

    
