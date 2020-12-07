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
public class GestioneGiocatori {
    
    protected ArrayList<Partecipante> list;
	
	public GestioneGiocatori() {
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
    
    
    
    
    
    

    
