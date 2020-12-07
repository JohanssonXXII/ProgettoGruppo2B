/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo.demo.lunedi;

/**
 *
 * @author Aimen
 */
public class Partecipante {
	private String fName;
	private String sName;
	
         /**
         * Costruttore partecipante serve per inizializare il partecipante
         *
         * 
         */
	public Partecipante(String fName, String sName) {
		super();
		this.fName = fName;
		this.sName = sName;
	}
        /**
         * getfName
         * Serve per visualizzare il nome del partecipante.
         * @return fName
         */
	public String getfName() {
		return fName;
	}
        /**
         * setfName
         * Serve per impostare il nome del partecipante
         * ;
         */
	public void setfName(String fName) {
		this.fName = fName;
	}
        /**
         * getsName
         * Serve per visualizzare il 2o nome
         * @return sName
         */
	public String getsName() {
		return sName;
	}
        /**
         * getsName
         * Serve per impostare il 2o nome
         * @param sName 
         */
	public void setsName(String sName) {
		this.sName = sName;
	}
        /**
         * toString
         * Visualizzare la persona in stringa
         * @return  this.fName +" " +this.sName;
         */
	@Override
	public String toString() {
		return this.fName +" " +this.sName;
	}
	

}
